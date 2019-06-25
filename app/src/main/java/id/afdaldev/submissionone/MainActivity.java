package id.afdaldev.submissionone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.res.TypedArray;
import android.os.Bundle;

import java.util.ArrayList;

import id.afdaldev.submissionone.adapter.CustomAdapter;
import id.afdaldev.submissionone.databinding.ActivityMainBinding;
import id.afdaldev.submissionone.model.MovieModel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    private CustomAdapter adapter;

    private String[] title;
    private String[] overview;
    private TypedArray imgMovie;
    private ArrayList<MovieModel> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        adapter = new CustomAdapter(this);
        activityMainBinding.listMovie.setAdapter(adapter);

        prepare();
        addItem();

    }

    private void addItem(){
        movies = new ArrayList<>();
        for (int i=0; i < title.length; i++){
            MovieModel movie = new MovieModel();
            movie.setTitle(title[i]);
            movie.setOverview(overview[i]);
            movie.setPhoto(imgMovie.getResourceId(i, -1));

            movies.add(movie);
        }
        adapter.setMovie(movies);
    }

    private void prepare(){
        title = getResources().getStringArray(R.array.data_title);
        overview = getResources().getStringArray(R.array.data_overview);
        imgMovie = getResources().obtainTypedArray(R.array.data_image);
    }
}
