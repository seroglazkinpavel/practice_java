package seminar_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
 * который записывает эту строку в простой текстовый файл, обработайте исключения.
*/

public class task_4 {
    public static void main(String[] args) {

    }

    static void fun4(String s, int n) {
        Logger logger = Logger.getLogger(task_4.class.getName());
        FileHandler fh = null;
        try {
            fh = new FileHandler("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fh.setLevel(Level.INFO);
        fh.setFormatter(simpleFormatter);
        logger.addHandler(fh);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        File file = new File("test.txt");
        FileWriter fileWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter("test.txt", false);
            fileWriter.write(sb.toString());
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
            logger.warning(e.getMessage());
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("СЂР°Р±РѕС‚Р°РµРј");
    }
}
