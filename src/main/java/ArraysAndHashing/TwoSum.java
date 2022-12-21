package ArraysAndHashing;

/*Учитывая массив целых чисел nums и целое число target, верните индексы двух чисел так, чтобы они составляли в сумме target .
Вы можете предположить, что каждый вход будет иметь ровно одно решение , и вы не можете использовать один и тот же элемент дважды.
Вы можете вернуть ответ в любом порядке.

Пример 1:
Ввод: nums = [2,7,11,15], target = 9
 Вывод: [0,1]
 Объяснение: Поскольку nums[0] + nums[1] == 9, мы возвращаем [0, 1].
*/

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = twoSum(new int[]{3,3}, 6);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] + nums[j-i] == target) {
                    return new int[]{j,j-i};
                }
            }
        }
        return null;
    }
}
