package tk.winten.app.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {

    private static OkHttpClient client = new OkHttpClient.Builder().connectTimeout(120, TimeUnit.SECONDS).readTimeout(120, TimeUnit.SECONDS).writeTimeout(120, TimeUnit.SECONDS).build();

    private static Retrofit getRetrofit() {
        return new Retrofit.Builder().baseUrl("https://winten.tk/wp-json/").client(client).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public static API getInstance() {
        return getRetrofit().create(API.class);
    }
}
