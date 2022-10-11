package practice_4;

import java.util.LinkedList;

/*Реализуйте очередь с помощью LinkedList со следующими методами:
 enqueue() - помещает элемент в конец очереди,
 dequeue() - возвращает первый элемент из очереди и удаляет его,
 first() - возвращает первый элемент из очереди, не удаляя. */

public class task_2 {
    LinkedList<Integer> list;

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(9);

        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.get(i));
        }
        System.out.println(" ");
        System.out.println(queue.first());
        System.out.println(queue.dequeue());
    }
}
