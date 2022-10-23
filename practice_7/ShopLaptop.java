package practice_7;

/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую 
необходимому критерию:
1 - ОЗУ      (Оперативная память)
2 - Объем ЖД (жеский диск)
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно 
также в Map. Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям */

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ShopLaptop {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(2, 1, "Windows 10", "white");
        Laptop laptop2 = new Laptop(3, 4, "Linux", "black");
        Laptop laptop3 = new Laptop(4, 6, "Windows 10", "black");
        Laptop laptop4 = new Laptop(5, 16, "MacOS", "white");

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);

        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Введите цифру, соответствующую необходимому критерию: \n" +
                        "1 - ОЗУ; 2 - Объем ЖД; 3 - Операционная система; 4 - Цвет");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            Map<Integer, String> map = new HashMap<>();
            while (number != 0) {
                if (number % 10 > 4) {
                    System.out.println("Цифра больше 4. Введите заного.");
                    break;
                }
                myMap(map, number);
                System.out.println(number % 10);
                number = number / 10;
            }
            Map<String, String> map1 = myScanner(map);
            Set<Laptop> laptops1 = myLaptop(map1, laptops);
            for (practice_7.Laptop iterable_element : laptops1) {
                System.out.println(iterable_element);
            }

        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
            System.exit(1);
        }
        sc.close();
    }

    static Map<Integer, String> myMap(Map<Integer, String> map, int number) {
        if (number % 10 == 1) {
            map.put(1, "ОЗУ");
        }
        if (number % 10 == 2) {
            map.put(2, "ЖД");
        }
        if (number % 10 == 3) {
            map.put(3, "ОС");
        }
        if (number % 10 == 4) {
            map.put(4, "цвет");
        }
        return map;
    }

    static Map<String, String> myScanner(Map<Integer, String> map) {
        Map<String, String> map1 = new LinkedHashMap<>();
        Scanner scn = new Scanner(System.in);
        for (String value : map.values()) {
            if (value == "ОЗУ") {
                System.out.println("Введите минимальные значения для ОЗУ: ");
                if (scn.hasNextInt()) {
                    String result = scn.nextLine();
                    map1.put("ram", result);
                    System.out.println("Вы ввели ОЗУ " + result);
                } else {
                    System.out
                            .println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
                    System.exit(1);
                }
            }
            if (value == "ЖД") {
                System.out.println("Введите минимальные значения объема ЖД: ");
                if (scn.hasNextInt()) {
                    String result = scn.nextLine();
                    map1.put("hardDrive", result);
                    System.out.println("Вы ввели ЖД " + result);
                } else {
                    System.out
                            .println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
                    System.exit(1);
                }
            }
            if (value == "ОС") {
                System.out.println("Введите операционную систему: ");
                if (scn.hasNextLine()) {
                    String result = scn.nextLine();
                    map1.put("operatingSystem", result);
                    System.out.println("Вы ввели ОС " + result);
                }
            }
            if (value == "цвет") {
                System.out.println("Введите цвет: ");
                if (scn.hasNextLine()) {
                    String result = scn.nextLine();
                    map1.put("color", result);
                    System.out.println("Вы ввели Цвет " + result);
                }
            }
        }
        scn.close();
        return map1;
    }

    static Set<Laptop> myLaptop(Map<String, String> map1, Set<Laptop> laptops) {
        Set<Laptop> result = new HashSet<>();
        for (Laptop laptop : laptops) {
            boolean addLaptop = true;
            for (String filter : map1.keySet()) {
                switch (filter) {
                    case "ram":
                        int minRam = Integer.parseInt(map1.get(filter));
                        if (laptop.getRam() < minRam) {
                            addLaptop = false;
                        }
                        break;
                    case "hardDrive":
                        int minHardDrive = Integer.parseInt(map1.get(filter));
                        if (laptop.getHardDrive() < minHardDrive) {
                            addLaptop = false;
                        }
                        break;
                    case "operatingSystem":
                        if (!laptop.getOperatingSystem().equals(map1.get(filter))) {
                            addLaptop = false;
                        }
                        break;
                    case "color":
                        if (!laptop.getColor().equals(map1.get(filter))) {
                            addLaptop = false;
                        }
                        break;
                }
            }
            if (addLaptop) {
                result.add(laptop);
            }
        }
        return result;
    }
}
