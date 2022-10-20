package seminar_4;

/*Реализовать стек с помощью массива.
 * Нужно реализовать методы:
 * size(), empty(), push(), peek(), pop().
 */

public class task_5 {
    public static void main(String[] args) {
        MyLinked myList = new MyLinked();
        System.out.println(myList.empty());
        myList.push("Привет");
        System.out.println(myList.empty());
        myList.push("Пока");
        System.out.println(myList.peek());
        System.out.println(myList.peek());
        System.out.println(myList.pop());
        System.out.println(myList.pop());
    }
}
