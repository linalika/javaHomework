package homework6;
// Домашнее задание 6 урока
import okhttp3.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment("295212")// <- 8873 code passthru parameter on method
                .addQueryParameter("apikey", "Rc7c0nAiSJsey6vtNf1fi4eQvlXlzAXE")
                .addQueryParameter("language", "en")
                .build();
        Request request = new Request.Builder()
                .url(httpUrl)
                .build();
        Response response = okHttpClient.newCall(request).execute();
        String responseBody = response.body().string();
        System.out.println(responseBody);
    }
}
