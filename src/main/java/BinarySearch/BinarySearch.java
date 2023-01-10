package BinarySearch;

/*Дан массив целых чисел nums, отсортированных в порядке возрастания, и целое число target, напишите функцию для поиска target в nums.
  Если target существует, верните его индекс. В противном случае возвращайтесь -1.
  Вы должны написать алгоритм со O(log n)сложностью выполнения.*/

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12, 13}, 9));
    }

    public static int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int index;

        while (startIndex <= endIndex) {
            index = startIndex + (endIndex - startIndex) / 2;
            if (nums[index] == target) {
                return index;
            }
            if (nums[index] < target) {
                startIndex = index + 1;
            } else {
                endIndex = index - 1;
            }
        }
        return -1;
    }
}
