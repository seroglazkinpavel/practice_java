
import java.util.HashMap;

public class FamilyTree {
    private HashMap<Integer, Person> bd;

    public FamilyTree() {
        bd = new HashMap<>();
        int index = 0;
        bd.put(index++, new Father(1, "дедушка", "Петров Николай Николаевич", "Петров Виктор Николаевич"));
        bd.put(index++, new Mother(2, "бабушка", "Петрова Елена Владимировна", "Петров Виктор Николаевич"));
        bd.put(index++, new Father(3, "отец", "Петров Виктор Николаевич", "Петров Виктор Викторович"));
        bd.put(index++, new Mother(4, "мать", "Петрова Елена Владимировна", "Петров Виктор Викторович"));
        bd.put(index++, new Children(5, "мать Петрова Елена Владимировна", "Петров Виктор Викторович"));
    }

    /**
     * Вывод
     */
    public void printAll() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Person product : bd.values()) {
            stringBuilder.append(product.getId()).append(". - ").append(product).append("\n");
        }
        System.out.println(stringBuilder);
    }

}
