package ArraysAndHashing;

import java.util.*;

/*Для заданного целочисленного массива nums возвращайте значение true, если какое-либо значение встречается
в массиве не менее двух раз, и возвращайте значение false, если все элементы различны.*/

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1})); //true
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4})); //false
    }

    public static boolean containsDuplicate(int[] nums) {
        //Runtime 4 ms, Memory 50.7 MB
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) { //Средняя алгоритмическая сложность вставки О(1)
                return true;
            }
        }
        return false;

        //Runtime 6 ms, Memory 55 MB
        // for (int num : nums) { //увеличивается время, увеличивается память
        /*Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;*/


    }
}
