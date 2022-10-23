package seminar_6;

/*
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.
 */
/*
1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы.
Создайте несколько экземпляров этого класса, выведите их в консоль.
2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка,
цвет и возраст (или другие параметры на ваше усмотрение).
 */

public class task_3 {
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
    }
}
