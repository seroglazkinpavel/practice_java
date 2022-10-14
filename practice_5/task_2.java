package practice_5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

/*Пусть дан список сотрудников:Иван Иванов, Светлана Петрова, Кристина Белова,
 Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов,
 Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова,
 Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов Написать программу,
 которая найдет и выведет повторяющиеся имена с количеством повторений. 
 Отсортировать по убыванию популярности. Для сортировки удобно использовать TreeMap, 
 мы не успели, но я расписал пример использования и прикрепил к материалам урока в файле TestTreeMap*/

public class task_2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Иван Иванов");
        arrayList.add("Светлана Петрова");
        arrayList.add("Кристина Белова");
        arrayList.add("Анна Мусина");
        arrayList.add("Анна Крутова");
        arrayList.add("Иван Юрин");
        arrayList.add("Петр Лыков");
        arrayList.add("Павел Чернов");
        arrayList.add("Петр Чернышов");
        arrayList.add("Мария Федорова");
        arrayList.add("Марина Светлова");
        arrayList.add("Мария Савина");
        arrayList.add("Мария Рыкова");
        arrayList.add("Марина Лугова");
        arrayList.add("Анна Владимирова");
        arrayList.add("Иван Мечников");
        arrayList.add("Петр Петин");
        arrayList.add("Иван Ежов");
        ArrayList<String> arrayList1 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            String[] str = arrayList.get(i).split(" ");
            arrayList1.add(str[0]);
        }
        // System.out.print(arrayList1);
        List<String> list = new ArrayList<>(arrayList1.size());
        List<String> list1 = new ArrayList<>(arrayList1.size());
        for (int i = 0; i < arrayList1.size(); i++) {
            int count = 1;
            if (!list1.contains(arrayList1.get(i))) {
                list1.add(arrayList1.get(i));
                for (int j = i + 1; j < arrayList1.size(); j++) {
                    if (arrayList1.get(i).equals(arrayList1.get(j))) {
                        count++;
                    }
                }
                list.add(arrayList1.get(i) + "=" + count);
            }
        }
        // System.out.print(list);

        Comparator<Integer> reverseOrderComparator = Comparator.reverseOrder();
        TreeMap<Integer, ArrayList<String>> map = new TreeMap<>(reverseOrderComparator);
        for (String item : list) {
            String[] str = item.split("=");
            int n = Integer.parseInt(str[1]);
            if (map.containsKey(n)) {
                ArrayList<String> list2 = map.get(n);
                list2.add(str[0]);
            } else {
                ArrayList<String> list2 = new ArrayList();
                list2.add(str[0]);
                map.put(n, list2);
            }
        }
        System.out.println(map);
    }
}
