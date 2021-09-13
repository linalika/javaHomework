package lesson5;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class StreamsExamples {
    public static void main(String[] args) {
        File file = new File("out2.txt");

//        long time = System.currentTimeMillis();
//
//        try(OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file,true))) {
//            for (int i =0; i<5*1024*1024;i++){
//                outputStream.write(65);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Время " +(System.currentTimeMillis() - time));

        try (InputStream inputStream = new FileInputStream("1.txt")) {
            byte[] bytes =null;
            bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            System.out.println( new String(bytes, StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
