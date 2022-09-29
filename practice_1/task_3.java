package practice_1;
/*Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
 Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему. */

import java.util.Arrays;

public class task_3 {
    public static void main(String args[]) {
        /*
         * 1 Способ
         * int[] array = { 3, 2, 2, 3 };
         * System.out.println(Arrays.toString(array));
         * int tmp = array[0];
         * for (int i = 0; i < array.length - 1; ++i) {
         * array[i] = array[i + 1];
         * }
         * array[array.length - 1] = tmp;
         * System.out.println(Arrays.toString(array));
         */
        int[] array = { 3, 2, 2, 3 };
        System.out.println(Arrays.toString(array));
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

}