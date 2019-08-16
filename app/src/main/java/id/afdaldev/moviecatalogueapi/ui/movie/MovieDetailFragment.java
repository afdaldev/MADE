package id.afdaldev.moviecatalogueapi.ui.movie;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import id.afdaldev.moviecatalogueapi.R;
import id.afdaldev.moviecatalogueapi.common.Constants;
import id.afdaldev.moviecatalogueapi.data.local.movie.MovieDao;
import id.afdaldev.moviecatalogueapi.data.local.TmDb;
import id.afdaldev.moviecatalogueapi.data.model.MovieResponse;
import id.afdaldev.moviecatalogueapi.databinding.DetailItemBinding;

public class MovieDetailFragment extends Fragment {

    private DetailItemBinding detailItemBinding;
    public static String MOVIE_KEY = "movie_key";

    private MovieResponse.Results movies;
    private TmDb tmDb;
    private boolean isFavorite = false;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        detailItemBinding = DataBindingUtil.inflate(inflater, R.layout.detail_item, container, false);
        return detailItemBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tmDb = TmDb.getDatabase(getActivity());

        getMovieDetail();
        setHasOptionsMenu(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(movies.getTitle());

        isMovieFavorite(movies.getId());
    }

    private void getMovieDetail() {
        detailItemBinding.pbDetail.setVisibility(View.VISIBLE);
        Bundle bundle = getArguments();
        movies = bundle.getParcelable(MOVIE_KEY);
        detailItemBinding.pbDetail.setVisibility(View.GONE);
        //Top
        detailItemBinding.detailTop.titleSection.tvTitle.setText(movies.getTitle());
        detailItemBinding.detailTop.titleSection.ratingBar.setRating(Float.parseFloat(String.valueOf(Double.valueOf(movies.getVoteAverage() / 2))));
        detailItemBinding.detailTop.titleSection.chipPopularity.setText(String.valueOf(movies.getPopularity()));
        detailItemBinding.detailTop.titleSection.chipVote.setText(String.valueOf(movies.getVoteCount()));
        Glide.with(this)
                .load(Constants.BACKDROP_URL + movies.getBackdropPath())
                .into(detailItemBinding.detailTop.imgBackdrop);
        Glide.with(this)
                .load(Constants.POSTER_URL + movies.getPosterPath())
                .into(detailItemBinding.detailTop.imgPoster);

        //Bottom
        detailItemBinding.detailBottom.tvOverview.setText(movies.getOverview());
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.favorite_menu, menu);

        if (isFavorite) {
            menu.findItem(R.id.favorite).setIcon(getResources()
                    .getDrawable(R.drawable.ic_favorite));
        } else {
            menu.findItem(R.id.favorite).setIcon(getResources()
                    .getDrawable(R.drawable.ic_favorite_border));
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.favorite) {
            if (isFavorite) {
                item.setIcon(R.drawable.ic_favorite_border);
                deleteFromFavorite(movies.getId());
                isFavorite = false;
            } else {
                item.setIcon(R.drawable.ic_favorite);
                addToFavorite(movies);
                isFavorite = true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    private void addToFavorite(MovieResponse.Results movie) {
        MovieDao movieDao = tmDb.movieDao();
        try {
            movieDao.insertMovie(movie);
            Toast.makeText(getActivity(), "Add Movie to Favorite", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("addError", e.getMessage());
        }
    }

    private void deleteFromFavorite(int id) {
        MovieDao movieDao = tmDb.movieDao();
        try {
            movieDao.deleteMovieById(id);
            Toast.makeText(getActivity(), "Delete Movie from Favorite", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("deleteError", e.getMessage());
        }
    }

    private void isMovieFavorite(int id) {
        MovieDao movieDao = tmDb.movieDao();
        try {
            int count = movieDao.movieById(id);

            if (count == 0) {
                isFavorite = false;
            } else {
                isFavorite = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
