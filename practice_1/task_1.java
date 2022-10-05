package practice_1;

import java.util.Calendar;
import java.util.Scanner;

/**
 * В консоли запросить имя пользователя. В зависимости от текущего времени,
 * вывести приветствие вида
 * • "Доброе утро, <Имя>!", если время от 05:00 до 11:59
 * • "Добрый день, <Имя>!", если время от 12:00 до 17:59;
 * • "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
 * • "Доброй ночи,<Имя>!", если время от 23:00 до 4:59
 */
public class task_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();

        Calendar calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR);
        int hour_second = (hour + 12) * 3600;
        int minute_second = (calendar.get(Calendar.MINUTE)) * 60;
        int second = calendar.get(Calendar.SECOND);
        int sum = hour_second + minute_second + second;

        if (18000 < sum && sum < 43140) {
            System.out.printf("Доброе утро!" + name + "!");
            in.close();
        } else if (43200 < sum && sum < 64740) {
            System.out.printf("Доброе день," + name + "!");
            in.close();
        } else if (64800 < sum && sum < 82740) {
            System.out.printf("Добрый вечер!" + name + "!");
            in.close();
        } else {
            System.out.printf("Доброй ночи!" + name + "!");
            in.close();
        }
    }
}