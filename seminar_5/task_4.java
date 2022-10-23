package seminar_5;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/*
Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
 */

public class task_4 {
    public static void main(String[] args) {
        Map<Integer, ArrayList<String>> map = new TreeMap<>(); // создаем соритруемый по ключу TreeMap, ключ это длинна
                                                               // строки, значение - список слов данной длинны
        /*
         * если надо создать TreeMap с каким то другим вариантом сортировки, то
         * необходимо в конструктор передать класс компаратор,
         * в методе compare в качестве аргументов два интеджера, так как ключ этого
         * типа.
         * В методе compare надо научить TreeMap сравнивать ключи по новому,
         * если метод возвращает 0, то считается, что ключи равны,
         * если 1, то первый ключ больше, если -1, то второй ключ больше
         * Для описание годится обычный if
         * или можно взять метод compare у уже существующих классов.
         * Сделал пример со сравнением через метод compare класса Integer. По умолчанию
         * и так используется метод compare у класса ключа
         * 
         * Map<Integer, String> map1 = new TreeMap<>(new Comparator<Integer>() {
         * 
         * @Override
         * public int compare(Integer key1, Integer key2) {
         * return Integer.compare(key1, key2);
         * }
         * });
         */

        String s = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        String[] strings = s.split(" "); // делим строку по словам
        for (String word : strings) { // перебираем слова
            if (map.containsKey(word.length())) { // если слова данной длинны уже встречались, то получаем список слов и
                                                  // добавляем свое
                ArrayList<String> list = map.get(word.length());
                list.add(word);
            } else { // если слова данной длинны не встречались, то создаем новый список и кладем в
                     // TreeMap
                ArrayList list = new ArrayList();
                list.add(word);
                map.put(word.length(), list);
            }
        }
        System.out.println(map);
    }
}
