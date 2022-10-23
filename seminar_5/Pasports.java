package seminar_5;

import java.util.HashMap;
import java.util.Map;

public class Pasports {
    private Map<String, String> map;

    public Pasports() {
        map = new HashMap<>();
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
}
