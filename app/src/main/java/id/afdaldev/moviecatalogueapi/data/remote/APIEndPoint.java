package id.afdaldev.moviecatalogueapi.data.remote;

import id.afdaldev.moviecatalogueapi.data.model.MovieResponse;
import id.afdaldev.moviecatalogueapi.data.model.TVShowResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIEndPoint {

    @GET("discover/movie")
    Call<MovieResponse> getMovies(
            @Query("api_key") String apiKey,
            @Query("language") String language);

    @GET("discover/tv")
    Call<TVShowResponse> getTV(
            @Query("api_key") String apiKey,
            @Query("language") String language);
}