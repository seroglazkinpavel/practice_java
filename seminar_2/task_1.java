package seminar_2;

/*Дано четное число N(>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
 которая состоит из чередующихся символов c1 и c2, начиная с c1
 Ответ: c1c2c1...c2(всего N символов)*/

public class task_1 {
    public static void main(String[] args) {
        System.out.println(fun1('a', 'b', 6));
    }

    static String fun1(char c1, char c2, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
        }
        return sb.toString();
    }
}
