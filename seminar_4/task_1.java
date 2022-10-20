package seminar_4;

/*Замерте время, за которое в ArrayList добавляется 10000 элементов.
 * Замерте время, за которое в LinkedList добавляется 10000 элементов. Сравните с предыдущим.
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, 5);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);

        timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, 5);
        }
        timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }
}
