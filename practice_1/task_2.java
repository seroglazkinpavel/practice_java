/**
 *Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих
 */

package practice_1;

public class task_2 {
    public static void main(String[] args) {
        System.out.println(maxResultArray(new int[] { 1, 1, 0, 1, 1, 1 }));
    }

    public static int maxResultArray(int[] nums) {
        int lastResult = 0;
        int currentResult = 0;
        boolean prevElementIs = false;
        for (int i = 0; i <= nums.length - 1; i++) {
            int current = nums[i];
            if (current == 1) {
                currentResult++;
                prevElementIs = true;
            } else {
                if (prevElementIs) {
                    if (currentResult >= lastResult) {
                        lastResult = currentResult;
                    }
                    currentResult = 0;
                    prevElementIs = false;
                }
            }
        }
        return Math.max(currentResult, lastResult);
    }
}
