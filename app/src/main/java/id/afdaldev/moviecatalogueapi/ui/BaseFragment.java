package id.afdaldev.moviecatalogueapi.ui;

import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;

import java.util.ArrayList;
import java.util.List;

import id.afdaldev.moviecatalogueapi.R;
import id.afdaldev.moviecatalogueapi.common.Constants;
import id.afdaldev.moviecatalogueapi.data.model.MovieResponse;
import id.afdaldev.moviecatalogueapi.data.model.TVShowResponse;
import id.afdaldev.moviecatalogueapi.data.remote.Service;
import id.afdaldev.moviecatalogueapi.databinding.FragmentMainBinding;
import id.afdaldev.moviecatalogueapi.pref.LanguagePref;
import id.afdaldev.moviecatalogueapi.pref.SettingsActivity;
import id.afdaldev.moviecatalogueapi.ui.adapter.MovieAdapter;
import id.afdaldev.moviecatalogueapi.ui.adapter.TVAdapter;
import id.afdaldev.moviecatalogueapi.viewmodel.MovieViewModel;
import id.afdaldev.moviecatalogueapi.viewmodel.TVViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public abstract class BaseFragment extends Fragment {

    protected FragmentMainBinding mFragment;

    private GridLayoutManager gridLayout;

    private MovieAdapter movieAdapter;
    private List<MovieResponse.Results> movieList = new ArrayList<>();

    protected void movieView() {
        gridLayout = new GridLayoutManager(getActivity(), 2);
        movieAdapter = new MovieAdapter(movieList);
        mFragment.rvMovies.setLayoutManager(gridLayout);
        mFragment.rvMovies.setAdapter(movieAdapter);
    }

    protected void movieData() {
        showLoading(true);
        MovieViewModel movieViewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
        movieViewModel.init(getActivity());
        movieViewModel.getMovies().observe(this, new Observer<MovieResponse>() {
            @Override
            public void onChanged(MovieResponse movieResponse) {
                movieList.addAll(movieResponse.getResults());
                movieAdapter.notifyDataSetChanged();
                showLoading(false);
            }
        });
    }

    private TVAdapter tvAdapter;
    private List<TVShowResponse.Results> tvList = new ArrayList<>();

    protected void tvView() {
        gridLayout = new GridLayoutManager(getActivity(), 3);
        tvAdapter = new TVAdapter(tvList);
        mFragment.rvMovies.setLayoutManager(gridLayout);
        mFragment.rvMovies.setAdapter(tvAdapter);
    }

    protected void tvData() {
        showLoading(true);
        TVViewModel tvViewModel = ViewModelProviders.of(this).get(TVViewModel.class);
        tvViewModel.init(getActivity());
        tvViewModel.getTV().observe(this, new Observer<TVShowResponse>() {
            @Override
            public void onChanged(TVShowResponse tvShowResponse) {
                tvList.addAll(tvShowResponse.getResults());
                tvAdapter.notifyDataSetChanged();
                showLoading(false);
            }
        });
    }

    protected void searchMovieData(String querySearch) {
        Service.getAPI().getMoviesSearch(Constants.API_KEY, LanguagePref.getSettings(getActivity()), querySearch)
                .enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                List<MovieResponse.Results> searchMovieList = response.body().getResults();
                MovieAdapter adapter = new MovieAdapter(searchMovieList);
                mFragment.rvMovies.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<MovieResponse> call, Throwable t) {
                Log.d("onFailure", t.getMessage());
            }
        });
    }

    protected void searchTVData(String querySearch) {
        Service.getAPI().getTVSearch(Constants.API_KEY, LanguagePref.getSettings(getActivity()), querySearch)
                .enqueue(new Callback<TVShowResponse>() {
            @Override
            public void onResponse(Call<TVShowResponse> call, Response<TVShowResponse> response) {
                List<TVShowResponse.Results> searchTVList = response.body().getResults();
                TVAdapter adapter = new TVAdapter(searchTVList);
                mFragment.rvMovies.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<TVShowResponse> call, Throwable t) {
                Log.d("onFailure", t.getMessage());
            }
        });
    }

    protected void menuItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.settings) {
            Intent intent = new Intent(getActivity(), SettingsActivity.class);
            startActivity(intent);
        }
    }

    private void showLoading(Boolean state) {
        if (state) {
            mFragment.progressBar.setVisibility(View.VISIBLE);
        } else {
            mFragment.progressBar.setVisibility(View.GONE);
        }
    }
}
