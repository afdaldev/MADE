package id.afdaldev.moviecatalogueapi.repository;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;

import androidx.lifecycle.MutableLiveData;

import id.afdaldev.moviecatalogueapi.data.model.MovieResponse;
import id.afdaldev.moviecatalogueapi.data.remote.Service;
import id.afdaldev.moviecatalogueapi.settings.SettingsFragment;
import id.afdaldev.moviecatalogueapi.ui.LanguagePref;
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
}
