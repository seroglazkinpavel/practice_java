package practice_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* Пусть дан произвольный список целых чисел, удалить из него четные числа */
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

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
