package seminar_4;

import java.util.Arrays;

class MyLinked implements MyStack {
    private String[] list;
    private int size;

    public MyLinked() {
        list = new String[10];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public void push(String s) {
        if (list.length == size) {
            String[] s2 = new String[size * 2];
            s2 = Arrays.copyOf(list, size);
            list = s2;
        }
        list[size] = s;
        size++;
    }

    @Override
    public String peek() {
        return list[size - 1];
    }

    @Override
    public String pop() {
        String s = list[size - 1];
        size--;
        return s;
    }
}
