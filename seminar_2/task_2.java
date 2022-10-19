package seminar_2;

/*Напишите метод, который сжимает строку.
 * Пример: вход aaaabbbcdd. Результат: a4b3cd2
 */

public class task_2 {
    public static void main(String[] args) {
        String s = "aaaabbbcdd";
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        sb.append(s.charAt(s.length() - 1)).append(count);
        System.out.println(sb);
    }

}
