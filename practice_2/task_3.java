package practice_2;

/*
 * Дана строка sql-запроса "select * from students where ".
 * Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * Данные для фильтрации приведены ниже в виде json строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 * (используйте методы split и replace)
 * Результат:
 * "name = 'Ivanov' and country = 'Russia' and city = 'Moscow'"
 */

public class task_3 {
    public static void main(String[] args) {
        String s = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String[] str = s.split("\"");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("{") || str[i].equals("}")) {
                str[i] = "\"";
            }
            if (str[i].equals(":")) {
                str[i] = " = '";
            }
            if (str[i].equals(", ")) {
                str[i] = "' and '";
            }
            builder.append(str[i]);
        }
        System.out.println(builder.substring(0, builder.length() - 18) + "\"");
    }
}
