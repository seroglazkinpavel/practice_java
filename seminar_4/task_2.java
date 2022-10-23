package seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

/*Реализовать консольное приложение, которое:
 * Принимает от пользователя строку вида text~num. Нуqweжно рассплитить строку по ~,
 * сохранить text в связный список на позицию num. Если введено print~num,
 * выводим строку из позиции num в связном списке и удаляет ее из списка.
 */

public class task_2 {
    static LinkedList<String> list;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        list = new LinkedList<>();
        String s = scanner.nextLine();
        while (!s.equals("stop")) {
            String command = s.split("~")[0];
            switch (command) {
                case "print":
                    String s1 = remove(Integer.parseInt(s.split("~")[1]));
                    if (s1 == null) {
                        System.out.println("РїСѓСЃС‚Рѕ");
                    }
                    System.out.println(s1);
                    break;
                default:
                    int index = Integer.parseInt(s.split("~")[1]);
                    list.add(index, command);
            }
            s = scanner.nextLine();
        }

    }

    static String remove(int index) {
        return list.remove(index);
    }
}
