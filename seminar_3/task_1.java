package seminar_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/* Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран. */
public class task_1 {

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
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

    }
}