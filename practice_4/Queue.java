package practice_4;

import java.util.LinkedList;

public class Queue {
    private LinkedList<Integer> list;

    public Queue() {
        list = new LinkedList<>();
    }

    public boolean enqueue(Integer arg) {
        return list.add(arg);
    }

    public Integer dequeue() {
        return list.removeFirst();
    }

    public Integer first() {
        return list.getFirst();
    }

    public int size() {
        return list.size();
    }

    public Integer get(int i) {
        return list.get(i);
    }
}
