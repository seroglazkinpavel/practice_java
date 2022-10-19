package practice_4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. */

public class task_1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> rev = new LinkedList<>(list);
        System.out.println(rev);
        System.out.println(reverseList(rev));
    }

    public static List<Integer> reverseList(List<Integer> rev) {
        List<Integer> reverse = new LinkedList<>();
        for (int i = rev.size() - 1; i >= 0; i--) {
            reverse.add(rev.get(i));
        }
        return reverse;
    }

    // Второй способ с применением ListIterator
    /*
     * public static void main(String[] args) {
     * List<String> al = new LinkedList<>();
     * al.add("C");
     * al.add("A");
     * al.add("E");
     * al.add("B");
     * al.add("D");
     * al.add("F");
     * 
     * ListIterator litr = al.listIterator();
     * System.out.print("Начальное содержание : ");
     * while (litr.hasNext()) {
     * Object element = litr.next();
     * litr.set(element + ", ");
     * System.out.print(element + ", ");
     * }
     * System.out.println(" ");
     * System.out.print("Изменённое содержание : ");
     * 
     * while (litr.hasPrevious()) {
     * Object element = litr.previous();
     * System.out.print(element);
     * }
     * }
     */
}
