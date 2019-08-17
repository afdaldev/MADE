package id.afdaldev.moviecatalogueapi.viewmodel;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import id.afdaldev.moviecatalogueapi.data.model.MovieResponse;
import id.afdaldev.moviecatalogueapi.repository.MovieRepository;

public class MovieViewModel extends ViewModel {
    private MutableLiveData<MovieResponse> movies;
    private LiveData<List<MovieResponse.Results>> allMovies;
    private MovieRepository movieRepository;

    public MovieViewModel() {
        movieRepository = new MovieRepository();
    }

    public void init(Context context) {
        if (this.movies != null) {
            return;
        }
        movies = movieRepository.getMovies(context);
    }

    public MutableLiveData<MovieResponse> getMovies() {
        return this.movies;
    }

    public void initFavorite(Context context) {
        if (this.allMovies != null) {
            return;
        }
        allMovies = movieRepository.getAllMoviesFromLocal(context);
    }

    public LiveData<List<MovieResponse.Results>> getAllMoviesFromLocal(){
        return this.allMovies;
    }
}
