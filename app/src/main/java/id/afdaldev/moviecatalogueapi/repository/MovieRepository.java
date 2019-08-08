package id.afdaldev.moviecatalogueapi.repository;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import id.afdaldev.moviecatalogueapi.data.local.TmDb;
import id.afdaldev.moviecatalogueapi.data.local.movie.MovieDao;
import id.afdaldev.moviecatalogueapi.data.model.MovieResponse;
import id.afdaldev.moviecatalogueapi.data.remote.Service;
import id.afdaldev.moviecatalogueapi.pref.LanguagePref;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieRepository {

    public MovieRepository() {
    }

    public MutableLiveData<MovieResponse> getMovies(Context context) {
        final MutableLiveData<MovieResponse> movies = new MutableLiveData<>();
        Service.getAPI().getMovies("e88b2c06ed7e7674f2f912d812290a70", LanguagePref.getSettings(context)).enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                if (response.body() != null) {
                    movies.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<MovieResponse> call, Throwable t) {
                Log.d("onFailure", t.getMessage());
            }
        });
        return movies;
    }

    public LiveData<List<MovieResponse.Results>> getAllMoviesFromLocal(Context context) {
        LiveData<List<MovieResponse.Results>> getMoviesFromLocal;
        TmDb tmDb = TmDb.getDatabase(context);
        MovieDao movieDao = tmDb.movieDao();
        getMoviesFromLocal = movieDao.getAllMovies();
        return getMoviesFromLocal;
    }
}