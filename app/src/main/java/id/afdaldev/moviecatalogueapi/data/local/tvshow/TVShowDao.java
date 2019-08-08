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

    @Query("SELECT * FROM tv_show")
    LiveData<List<TVShowResponse.Results>> getAllTV();

    @Query("SELECT COUNT(*) FROM tv_show WHERE id = :id")
    int tvById(int id);

    @Query("DELETE FROM tv_show WHERE id = :id")
    int deleteTVById(int id);
}
