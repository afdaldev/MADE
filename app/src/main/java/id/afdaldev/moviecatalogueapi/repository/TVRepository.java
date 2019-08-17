package id.afdaldev.moviecatalogueapi.repository;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import id.afdaldev.moviecatalogueapi.common.Constants;
import id.afdaldev.moviecatalogueapi.data.local.TmDb;
import id.afdaldev.moviecatalogueapi.data.local.tvshow.TVShowDao;
import id.afdaldev.moviecatalogueapi.data.model.TVShowResponse;
import id.afdaldev.moviecatalogueapi.data.remote.Service;
import id.afdaldev.moviecatalogueapi.pref.LanguagePref;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TVRepository {

    public TVRepository() {
    }

    public MutableLiveData<TVShowResponse> getTV(Context context) {
        final MutableLiveData<TVShowResponse> tvShow = new MutableLiveData<>();
        Service.getAPI().getTV(Constants.API_KEY,
                LanguagePref.getSettings(context)).enqueue(new Callback<TVShowResponse>() {
            @Override
            public void onResponse(Call<TVShowResponse> call, Response<TVShowResponse> response) {
                if (response.body() != null) {
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

    public LiveData<List<TVShowResponse.Results>> getallTVFromLocal(Context context) {
        LiveData<List<TVShowResponse.Results>> getTVFromLocal;
        TmDb tmDb = TmDb.getDatabase(context);
        TVShowDao tvShowDao = tmDb.tvShowDao();
        getTVFromLocal = tvShowDao.getAllTV();
        return getTVFromLocal;
    }
}