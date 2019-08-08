package id.afdaldev.moviecatalogueapi.ui.movie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import java.util.ArrayList;
import java.util.List;
import id.afdaldev.moviecatalogueapi.R;
import id.afdaldev.moviecatalogueapi.data.model.MovieResponse;
import id.afdaldev.moviecatalogueapi.databinding.FragmentMainBinding;

public class MovieFavoriteFragment extends Fragment {

    private FragmentMainBinding fragmentMainBinding;
    private MovieAdapter movieAdapter;
    private List<MovieResponse.Results> movieList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentMainBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        fragmentMainBinding.rvMovies.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        movieAdapter = new MovieAdapter(movieList);
        fragmentMainBinding.rvMovies.setAdapter(movieAdapter);
        return fragmentMainBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showLoading(true);
        MovieViewModel movieViewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
        movieViewModel.initFavorite(getActivity());
        movieViewModel.getAllMoviesFromLocal().observe(this, new Observer<List<MovieResponse.Results>>() {
            @Override
            public void onChanged(List<MovieResponse.Results> results) {
                movieList.clear();
                movieList.addAll(results);
                showLoading(false);
                movieAdapter.notifyDataSetChanged();
            }
        });

    }

    private void showLoading(Boolean state){
        if (state){
            fragmentMainBinding.progressBar.setVisibility(View.VISIBLE);
        } else {
            fragmentMainBinding.progressBar.setVisibility(View.GONE);
        }
    }
}
