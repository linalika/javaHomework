package lesson6.socket;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlConnectionExamples {
    public static void main(String[] args) throws IOException {
//        URL url = new URL("https", "geekbrains.ru", "/");
//        InputStream inputStream = url.openStream();
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
//        String line;
//
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//        }
//        bufferedReader.close();

//        https://restful-booker.herokuapp.com/auth
//        https://restful-booker.herokuapp.com/auth \
//        -H 'Content-Type: application/json' \
//        -d '{
//        "username" : "admin",
//                "password" : "password123"
//    }'

    URL urlBooker = new URL("https://restful-booker.herokuapp.com/auth");
    HttpURLConnection httpURLConnection = (HttpURLConnection) urlBooker.openConnection();
    httpURLConnection.setRequestMethod("POST");
    httpURLConnection.setRequestProperty("Content-Type","application/json");
    httpURLConnection.setDoOutput(true);

    String authJson = "{\n" +
            "        \"username\" : \"admin\",\n" +
            "                \"password\" : \"password123\"\n" +
            "    }";
    try(BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream()))){
        bufferedWriter.write(authJson);
    }

    try(BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()))){
        String line2 = "";
        while ((line2 = bufferedReader1.readLine())!=null){
            System.out.println(line2);
        }
    }
}

}
