package practice_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.BufferedWriter;

/*Напишите метод, который вернет содержимое текущей папки в виде массива строк.
Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл. */

public class task_1 {
    public static void main(String[] args) {
        createFile();
    }

    public static String[] createArray() {
        try {
            String s = "C:\\Users\\MSI\\Desktop\\gb_java\\семинар\\practice_java\\practice_2";
            // Создает массив, в котором мы будем хранить имена файлов и каталогов
            String[] pathnames;
            // Создает новый экземпляр файла путем преобразования заданной строки пути
            // в абстрактное имя пути
            File f = new File(s);
            // Заполняет массив именами файлов и каталогов
            pathnames = f.list();
            return pathnames;
            // return Arrays.toString(pathnames);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public static void createFile() {
        Logger logger = Logger.getLogger(task_1.class.getName());
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
        BufferedWriter outputWriter = null;
        try {
            File file = new File("test.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter("test.txt", false);
            outputWriter = new BufferedWriter(fileWriter);
            String[] arr = createArray();
            for (int i = 0; i < arr.length; i++) {
                outputWriter.write(arr[i]);
                outputWriter.newLine();
            }
            outputWriter.flush();

        } catch (Exception e) {
            e.printStackTrace();
            logger.warning(e.getMessage());
        } finally {
            try {
                outputWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
