package seminar_3;

import java.util.ArrayList;
import java.util.List;

/*Создать список типа ArrayList. Поместить в него как строки, так и целые числа. 
 *Пройти по списку, найти и удалить целые числа.
*/

public class task_3 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("asdad5");
        list.add("asdad4");
        list.add("asdad3");
        list.add(22);
        list.add(22);
        list.add(22);
        list.add("asdad2");
        list.add("asdad1");
        list.add(22);

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
