package seminar_1;

/*Реализовать функцию возведения чиспа а в степень в. а,в Z
 * Cведя количество выполняемых действий к минимуму.
 * Пример 1: a = 3, b = 2, ответ: 9
 * Пример 2: a = 2, b = -2, ответ: 0.25
 * Пример 3: a = 3, b = 0, ответ: 1 
*/

public class task_1 {
    public static void main(String[] args) {
        System.out.println(pow(3, 2));
        System.out.println(pow(2, -2));
        System.out.println(pow(7, 0));
    }

    static double pow(int a, int b) {
        double a1 = a;
        double result = 1;
        if (b < 0) {
            a1 = 1.0 / a;
            b = -b;
        }
        for (int i = 0; i < b; i++) {
            result *= a1;
        }
        return result;
    }
}
