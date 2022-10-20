package seminar_6;

import java.util.HashSet;
import java.util.Set;

/*1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него 
некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, 
что все они сохранились во множество.
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true,
только если значения во всех полях сравниваемых объектов равны.
4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
 */

public class task_4 {
    public static void main(String[] args) {
        MyCat cat1 = new MyCat("Барсик", "Костя");
        cat1.setColor("рыжый");
        cat1.setAge(5);

        MyCat cat2 = new MyCat("Рыжик", "Степан");
        cat2.setColor("черный");
        cat2.setAge(10);
        System.out.println(cat1);
        System.out.println(cat2);

        MyCat cat3 = new MyCat("Рыжик", "Степан");
        cat3.setColor("черный");
        cat3.setAge(10);

        System.out.println(cat3.equals(cat2));

        Set<MyCat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        System.out.println(cats);
    }
}
