package seminar_3;

import java.util.ArrayList;
import java.util.List;

/*Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
 * Вывести название каждой планеты и количество его повторений висписке.
 */

public class task_2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Венера");
        list.add("Земля");
        list.add("Сатурн");
        list.add("Юпитер");
        list.add("Сатурн");
        list.add("Венера");
        System.out.println(list);

        List<String> list1 = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            if (!list1.contains(list.get(i))) {
                list1.add(list.get(i));
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i).equals(list.get(j))) {
                        count++;
                    }
                }
                System.out.println(list.get(i) + " встречаются " + count + " раз·");
            }
        }
    }
}
