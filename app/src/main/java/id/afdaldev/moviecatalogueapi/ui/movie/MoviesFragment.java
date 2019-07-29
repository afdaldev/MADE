package id.afdaldev.moviecatalogueapi.ui.movie;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import id.afdaldev.moviecatalogueapi.R;
import id.afdaldev.moviecatalogueapi.data.model.MovieResponse;
import id.afdaldev.moviecatalogueapi.databinding.FragmentMainBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesFragment extends Fragment {

    private FragmentMainBinding fragmentMainBinding;
    private MovieViewModel movieViewModel;
    private MovieAdapter adapter;
    private List<MovieResponse.Results> movieList = new ArrayList<>();


    public MoviesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentMainBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        adapter = new MovieAdapter(movieList);
        fragmentMainBinding.rvMovies.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        fragmentMainBinding.rvMovies.setAdapter(adapter);
        return fragmentMainBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showLoading(true);
        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
        movieViewModel.init(getActivity());
        movieViewModel.getMovies().observe(this, new Observer<MovieResponse>() {
            @Override
            public void onChanged(MovieResponse movieResponse) {
                movieList.addAll(movieResponse.getResults());
                showLoading(false);
                adapter.notifyDataSetChanged();
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
