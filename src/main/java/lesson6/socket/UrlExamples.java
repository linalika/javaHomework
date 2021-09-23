package lesson6.socket;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlExamples {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://smirnov:password@geekbrains.ru:80/cources?type=qa$level=super#1");
        System.out.println("Протокол" + url.getProtocol());
        System.out.println("Хост" + url.getHost());
        System.out.println("Файл" + url.getFile());
    }
}
