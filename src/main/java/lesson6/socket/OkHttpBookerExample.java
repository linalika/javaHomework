package lesson6.socket;

import okhttp3.*;

import java.io.IOException;

public class OkHttpBookerExample {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        String authJson = "{\n" +
                "        \"username\" : \"admin\",\n" +
                "                \"password\" : \"password123\"\n" +
                "    }";
        MediaType JSON = MediaType.parse("JSON");
        RequestBody requestBodyBooker = RequestBody.create(authJson, JSON);
        Request request = new Request.Builder()
                .url("https://restful-booker.herokuapp.com/auth")
                .post(requestBodyBooker)
                .addHeader("Content-type", "application/json")
                .build();
        Response response = okHttpClient.newCall(request).execute();
        String responseBody = response.body().string();
        String token = responseBody.split(":")[1].replaceAll("[\"}]","");
        System.out.println(token);
    }
}
//curl -X POST \
//        https://restful-booker.herokuapp.com/booking \
//        -H 'Content-Type: application/json' \
//        -d '{
//        "firstname" : "Jim",
//        "lastname" : "Brown",
//        "totalprice" : 111,
//        "depositpaid" : true,
//        "bookingdates" : {
//        "checkin" : "2018-01-01",
//        "checkout" : "2019-01-01"
//        },
//        "additionalneeds" : "Breakfast"
//        }'