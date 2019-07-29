package id.afdaldev.moviecatalogueapi.repository;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import id.afdaldev.moviecatalogueapi.data.model.TVShowResponse;
import id.afdaldev.moviecatalogueapi.data.remote.Service;
import id.afdaldev.moviecatalogueapi.settings.SettingsFragment;
import id.afdaldev.moviecatalogueapi.ui.LanguagePref;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TVRepository {

    public TVRepository() {
    }

    public MutableLiveData<TVShowResponse> getTV(Context context){
        final MutableLiveData<TVShowResponse> tvShow = new MutableLiveData<>();
        Service.getAPI().getTV("e88b2c06ed7e7674f2f912d812290a70", LanguagePref.getSettings(context)).enqueue(new Callback<TVShowResponse>() {
            @Override
            public void onResponse(Call<TVShowResponse> call, Response<TVShowResponse> response) {
                if (response.body() != null){
                    tvShow.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<TVShowResponse> call, Throwable t) {
                Log.d("onFailure", t.getMessage());
            }
        });
        return tvShow;
    }
}
