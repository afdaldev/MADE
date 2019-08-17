package id.afdaldev.moviecatalogueapi.data.remote;

import id.afdaldev.moviecatalogueapi.data.model.MovieResponse;
import id.afdaldev.moviecatalogueapi.data.model.TVShowResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIEndPoint {

    String API_KEY = "api_key";
    String LANGUAGE = "language";
    String QUERY = "query";

    @GET("discover/movie")
    Call<MovieResponse> getMovies(
            @Query(API_KEY) String apiKey,
            @Query(LANGUAGE) String language);

    @GET("search/movie")
    Call<MovieResponse> getMoviesSearch(
            @Query(API_KEY) String apiKey,
            @Query(LANGUAGE) String language,
            @Query(QUERY) String querySearch);

    @GET("discover/tv")
    Call<TVShowResponse> getTV(
            @Query(API_KEY) String apiKey,
            @Query(LANGUAGE) String language);

    @GET("search/tv")
    Call<TVShowResponse> getTVSearch(
            @Query(API_KEY) String apiKey,
            @Query(LANGUAGE) String language,
            @Query(QUERY) String querySearch);
}