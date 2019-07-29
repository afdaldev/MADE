package id.afdaldev.moviecatalogueapi.ui.tv;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.afdaldev.moviecatalogueapi.data.model.TVShowResponse;
import id.afdaldev.moviecatalogueapi.repository.TVRepository;

public class TVViewModel extends ViewModel {

    private MutableLiveData<TVShowResponse> tvShow;
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
}
