package practice_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> map;
    private Map<String, ArrayList<String>> map1;

    public PhoneBook() {
        map = new HashMap<>();
        map1 = new HashMap<>();
    }

    void add(String number, String name) {
        map.put(number, name);
    }

    public void printPerson(String name) {
        for (String key : map.keySet()) {
            if (map.get(key).equals(name)) {
                System.out.println(key + " " + map.get(key));
            }
        }
    }

    public void printPerson1(String number) {
        for (String key : map.keySet()) {
            if (map.get(key).equals(map.get(number))) {
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}
