package id.afdaldev.moviecatalogueapi.data.local.tvshow;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import id.afdaldev.moviecatalogueapi.data.model.TVShowResponse;

@Dao
public interface TVShowDao {

    @Insert
    void insertTV(TVShowResponse.Results tv);

    @Query("SELECT * FROM " + TVShowResponse.TABLE_NAME)
    LiveData<List<TVShowResponse.Results>> getAllTV();

    @Query("SELECT COUNT(*) FROM " + TVShowResponse.TABLE_NAME + " WHERE " + TVShowResponse.COLUMNS_ID + " = :id")
    int tvById(int id);

    @Query("DELETE FROM " + TVShowResponse.TABLE_NAME + " WHERE " + TVShowResponse.COLUMNS_ID + " = :id")
    void deleteTVById(int id);
}
