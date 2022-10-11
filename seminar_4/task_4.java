package seminar_4;

import java.util.LinkedList;
import java.util.Stack;

/*Написать метод, который принимает массив элементов, помещает их в стек и выводит на консоль содержимое стэка.
 * Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
 */

public class task_4 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 4, 2, 7, -3, 6, -8, 9 };
        mStack(arr);
        mLinkedList(arr);
    }

    static void mStack(Object[] arr) {
        if (arr instanceof Integer[]) {
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < arr.length; i++) {
                stack.push((Integer) arr[i]);
            }
            while (!stack.empty()) {
                System.out.println(stack.pop());
            }
        }
    }

    static void mLinkedList(Object[] arr) {
        if (arr instanceof Integer[]) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int i = 0; i < arr.length; i++) {
                linkedList.push((Integer) arr[i]);
            }
            while (linkedList.size() > 0) {
                System.out.println(linkedList.removeLast());
            }
        }
    }
}
