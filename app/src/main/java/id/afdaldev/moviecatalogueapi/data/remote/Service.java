package id.afdaldev.moviecatalogueapi.data.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Service {
    private static final String BASE_URL = "https://api.themoviedb.org/3/";

    public static APIEndPoint getAPI(){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();
        return retrofit.create(APIEndPoint.class);
    }
}
