package practice_2;

/*Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
1 Расширение файла: txt
2 Расширение файла: pdf
3 Расширение файла:
4 Расширение файла: jpg */

import java.io.File;

public class task_2 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\MSI\\Desktop\\gb_java\\семинар\\practice_java\\practice_2\\myTest\\test.txt");
        if (file.exists()) {
            System.out.println("Расширение файла: " + getFileExtension(file));
        }

        // проверяем метод на файле без расширения
        file = new File("C:\\Users\\MSI\\Desktop\\gb_java\\семинар\\practice_java\\practice_2\\myTest\\temp");
        if (file.exists()) {
            System.out.println("Расширение файла: " + getFileExtension(file));
        }

        // проверяем метод на файле с точкой в имени
        file = new File("C:\\Users\\MSI\\Desktop\\gb_java\\семинар\\practice_java\\practice_2\\myTest\\test.jpg");
        if (file.exists()) {
            System.out.println("Расширение файла: " + getFileExtension(file));
        }

        // проверяем метод на файле без расширения
        file = new File("C:\\Users\\MSI\\Desktop\\gb_java\\семинар\\practice_java\\practice_2\\myTest\\test.pdf");
        if (file.exists()) {
            System.out.println("Расширение файла: " + getFileExtension(file));
        }
    }

    // метод определения расширения файла
    private static String getFileExtension(File file) {
        String fileName = file.getName();
        // если в имени файла есть точка и она не является первым символом в названии
        // файла
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            // то вырезаем все знаки после последней точки в названии файла, то есть
            // ХХХХХ.txt -> txt
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        // в противном случае возвращаем заглушку, то есть расширение не найдено
        else
            return "";
    }
}