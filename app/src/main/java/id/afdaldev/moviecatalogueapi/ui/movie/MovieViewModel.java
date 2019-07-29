package id.afdaldev.moviecatalogueapi.ui.movie;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import id.afdaldev.moviecatalogueapi.data.model.MovieResponse;
import id.afdaldev.moviecatalogueapi.repository.MovieRepository;

public class MovieViewModel extends ViewModel {
    private MutableLiveData<MovieResponse> movies;
    private MovieRepository movieRepository;

    public MovieViewModel() {
        movieRepository = new MovieRepository();
    }

    public void init(Context context){
        if (this.movies != null){
            return;
        }
        movies = movieRepository.getMovies(context);
    }

    public MutableLiveData<MovieResponse> getMovies(){
        return this.movies;
    }
}
