package practice_5;

/*Реализуйте структуру телефонной книги с помощью HashMap,
 учитывая, что 1 человек может иметь несколько телефонов. */

public class task_1 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("12-34-56", "Человек");
        phoneBook.add("32-14-56", "Человек");
        phoneBook.add("23-45-61", "Человек");
        phoneBook.add("23-44-32", "Человек_1");
        phoneBook.add("65-43-21", "Человек_1");
        phoneBook.add("34-56-78", "Человек_1");
        phoneBook.add("Человек_2", "{34-56-78, 34-56-78, 23-44-32}");
        phoneBook.printPerson("Человек_1");
        phoneBook.printPerson1("Человек_2");
    }
}
