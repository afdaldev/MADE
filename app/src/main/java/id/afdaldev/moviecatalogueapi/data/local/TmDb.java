package id.afdaldev.moviecatalogueapi.data.local;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import id.afdaldev.moviecatalogueapi.data.local.movie.MovieDao;
import id.afdaldev.moviecatalogueapi.data.local.tvshow.TVShowDao;
import id.afdaldev.moviecatalogueapi.data.model.MovieResponse;
import id.afdaldev.moviecatalogueapi.data.model.TVShowResponse;

@Database(entities = {MovieResponse.Results.class, TVShowResponse.Results.class}, version = 2, exportSchema = false)
public abstract class TmDb extends RoomDatabase {

    private static volatile TmDb INSTANCE;

    public abstract MovieDao movieDao();

    public abstract TVShowDao tvShowDao();

    public static TmDb getDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (TmDb.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            TmDb.class, "tm_db")
                            .allowMainThreadQueries()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
