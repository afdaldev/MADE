package id.afdaldev.moviecatalogueapi.data.local.movie;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import id.afdaldev.moviecatalogueapi.data.model.MovieResponse;

@Dao
public interface MovieDao {

    @Insert
    void insertMovie(MovieResponse.Results movie);

    @Query("SELECT * FROM " + MovieResponse.TABLE_NAME)
    LiveData<List<MovieResponse.Results>> getAllMovies();

    @Query("SELECT COUNT(*) FROM " + MovieResponse.TABLE_NAME + " WHERE " + MovieResponse.COLUMN_ID + " = :id")
    int movieById(int id);

    @Query("DELETE FROM " + MovieResponse.TABLE_NAME + " WHERE " + MovieResponse.COLUMN_ID + " = :id")
    void deleteMovieById(int id);
}
