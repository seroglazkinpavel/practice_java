package seminar_6;

import java.util.*;
/*
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.

 */

public class task_1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set);
        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(9, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set1);
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(9, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set2);
    }
}
