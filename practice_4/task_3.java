package practice_4;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор */

public class task_3 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.print(list);
        ListIterator<Integer> litr = list.listIterator();
        int sum = 0;
        while (litr.hasNext()) {
            Object element = litr.next();
            int x = ((Integer) element).intValue();
            sum = sum + x;
        }
        System.out.println(" ");
        System.out.println(sum);
    }
}
