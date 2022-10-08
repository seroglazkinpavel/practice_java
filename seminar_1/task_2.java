package seminar_1;

/*
 * На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть
 * две команды
 * - команда 1 (к1): увеличить в с раза, а умножается на c
 * - команда 2 (к2): увеличить на d, к a прибавляется d
 * написать программу, которая выдаёт набор команд, позволяющий число a
 * превратить в число b или сообщить, что это невозможно
 * Пример 1: а = 1, b = 7, c = 2, d = 1
 * ответ: 2
 * Можно начать с более простого – просто подсчёта общего количества вариантов
 * Пример 2: а = 11, b = 7, c = 2, d = 1
 * ответ: нет решения.
 */

public class task_2 {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 }) == 3);
        System.out.println(findMaxConsecutiveOnes(new int[] { 1, 0, 1, 1, 0, 1 }) == 2);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int lastConsequence = 0;
        int currentConsequence = 0;
        boolean prevElementIsOne = false;
        for (int i = 0; i <= nums.length - 1; i++) {
            int current = nums[i];
            if (current == 1) {
                currentConsequence++;
                prevElementIsOne = true;
            } else {
                if (prevElementIsOne) {
                    // последовательность оборвалась
                    if (currentConsequence >= lastConsequence) {
                        lastConsequence = currentConsequence;
                    }
                    currentConsequence = 0;
                    prevElementIsOne = false;
                }
            }
        }
        return Math.max(currentConsequence, lastConsequence);
    }
}
