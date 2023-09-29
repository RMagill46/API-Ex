package api;

import okhttp3.*;

import java.io.IOException;

public class ApiTestCall {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://statsapi.web.nhl.com/api/v1/gameTypes")
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }
}