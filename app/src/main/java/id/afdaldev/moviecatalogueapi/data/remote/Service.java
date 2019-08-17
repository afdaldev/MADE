package id.afdaldev.moviecatalogueapi.data.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static id.afdaldev.moviecatalogueapi.common.Constants.BASE_URL;

public class Service {

    public static APIEndPoint getAPI() {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();
        return retrofit.create(APIEndPoint.class);
    }
}
