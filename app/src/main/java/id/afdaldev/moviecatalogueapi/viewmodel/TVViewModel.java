package id.afdaldev.moviecatalogueapi.viewmodel;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import id.afdaldev.moviecatalogueapi.data.model.TVShowResponse;
import id.afdaldev.moviecatalogueapi.repository.TVRepository;

public class TVViewModel extends ViewModel {

    private MutableLiveData<TVShowResponse> tvShow;
    private LiveData<List<TVShowResponse.Results>> allTV;
    private TVRepository tvRepository;

    public TVViewModel() {
        tvRepository = new TVRepository();
    }

    public void init(Context context){
        if (this.tvShow != null){
            return;
        }
        tvShow = tvRepository.getTV(context);
    }

    public MutableLiveData<TVShowResponse> getTV(){
        return this.tvShow;
    }

    public void initFavorite(Context context){
        if (this.allTV != null){
            return;
        }
        allTV = tvRepository.getallTVFromLocal(context);
    }

    public LiveData<List<TVShowResponse.Results>> getAllTVFromLocal(){
        return allTV;
    }
}
