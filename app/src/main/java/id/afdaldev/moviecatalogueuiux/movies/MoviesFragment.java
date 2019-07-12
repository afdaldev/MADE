package id.afdaldev.moviecatalogueuiux.movies;


import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.afdaldev.moviecatalogueuiux.R;
import id.afdaldev.moviecatalogueuiux.databinding.FragmentMovieBinding;
import id.afdaldev.moviecatalogueuiux.model.Model;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesFragment extends Fragment {

    private ArrayList<Model> movies;
    private String[] title;
    private String[] overview;
    private TypedArray imgMovie;

    public MoviesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prepare();
        addItem();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentMovieBinding fragmentMovieBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_movie, container, false);
        fragmentMovieBinding.rvMovie.setLayoutManager(new LinearLayoutManager(getActivity()));

        MoviesAdapter adapter = new MoviesAdapter(movies, getActivity());
        fragmentMovieBinding.rvMovie.setAdapter(adapter);
        return fragmentMovieBinding.getRoot();
    }

    private void addItem(){
        movies = new ArrayList<>();
        for (int i =0; i < title.length; i++){
            Model model = new Model();
            model.setTitle(title[i]);
            model.setOverview(overview[i]);
            model.setPhoto(imgMovie.getResourceId(i, -1));

            movies.add(model);
        }
    }

    private void prepare(){
        title = getResources().getStringArray(R.array.data_title_movie);
        overview = getResources().getStringArray(R.array.data_overview_movie);
        imgMovie = getResources().obtainTypedArray(R.array.data_image_movie);
    }
}
