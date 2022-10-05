package practice_1;

/**
 * Вычислить n-ое треугольное число
 */
public class task_4 {

    public static void main(String[] args) {
        System.out.println(triangular_number(3));
    }

    public static int triangular_number(int n) {
        int namber = n * (n + 1) / 2;
        return namber;
    }
}