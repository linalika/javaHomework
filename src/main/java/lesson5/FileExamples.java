package lesson5;

import java.io.File;
import java.io.IOException;

public class FileExamples {
    public static void main(String[] args) {
        File file = new File("1.txt");

        System.out.println(file.exists());
        try {
            file.createNewFile();
            System.out.println(file.length());
            file.deleteOnExit();

            File filePath = new File("1");

            filePath.mkdir();

            File filePaths = new File("2/1/4/5");

            filePaths.mkdirs();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
