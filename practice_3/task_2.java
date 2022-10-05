package practice_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. (Collections.max()) */

public class task_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        Random random = new Random();
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        System.out.println(sum / list.size());
    }
}
