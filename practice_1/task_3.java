package practice_1;
/*Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
 Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему. */

import java.util.Arrays;

public class task_3 {
    public static void main(String args[]) {
        int[] array = { 3, 2, 2, 3 };
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = 3;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] != 3) {
                arr[i - 1] = array[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}