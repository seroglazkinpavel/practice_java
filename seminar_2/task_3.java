package seminar_2;

/* Напишите метод, который принимает на вход строку(String) и определяет является ли строка палиндромом
 * (возвращает boolean значение)
 */

public class task_3 {
    public static void main(String[] args) {
        String s = "потоп";
        System.out.println(fun3(s));
    }

    static boolean fun3(String s) {
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
