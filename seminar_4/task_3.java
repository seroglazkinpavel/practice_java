package seminar_4;

import java.util.Scanner;
import java.util.Stack;

/*Реализовать консольное приложение, которое:
 * Принимает от пользователя и "запоминает" строки. Если введено print, выводит строки так,
 * чтобы последняя введенная была первой в списке, а первая - последней. Если введено revert,
 * удаляет предыдущую введенную строку из памяти.
 */

public class task_3 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        while (!s.equals("stop")) {
            switch (s) {
                case "print":
                    while (!stack.empty()) {
                        System.out.println(stack.pop());
                    }
                    break;
                default:
                    stack.push(s);
            }
            s = scanner.nextLine();
        }
    }

}
