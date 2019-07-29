package id.afdaldev.moviecatalogueapi.ui.movie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import id.afdaldev.moviecatalogueapi.R;
import id.afdaldev.moviecatalogueapi.common.Constants;
import id.afdaldev.moviecatalogueapi.data.model.MovieResponse;
import id.afdaldev.moviecatalogueapi.databinding.DetailItemBinding;

public class MovieDetailFragment extends Fragment {

    private DetailItemBinding detailItemBinding;
    public static String MOVIE_KEY = "movie_key";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        detailItemBinding = DataBindingUtil.inflate(inflater, R.layout.detail_item, container, false);
        getMovieDetail();

        return detailItemBinding.getRoot();
    }

    private void getMovieDetail(){
        detailItemBinding.pbDetail.setVisibility(View.VISIBLE);
        Bundle bundle = getArguments();
        MovieResponse.Results results = bundle.getParcelable(MOVIE_KEY);
        detailItemBinding.pbDetail.setVisibility(View.GONE);
        //Top
        detailItemBinding.detailTop.titleSection.tvTitle.setText(results.getTitle());
        detailItemBinding.detailTop.titleSection.ratingBar.setRating(Float.parseFloat(String.valueOf(Double.valueOf(results.getVoteAverage() / 2))));
        detailItemBinding.detailTop.titleSection.chipPopularity.setText(String.valueOf(results.getPopularity()));
        detailItemBinding.detailTop.titleSection.chipVote.setText(String.valueOf(results.getVoteCount()));
        Glide.with(this)
                .load(Constants.BACKDROP_URL + results.getBackdropPath())
                .into(detailItemBinding.detailTop.imgBackdrop);
        Glide.with(this)
                .load(Constants.POSTER_URL + results.getPosterPath())
                .into(detailItemBinding.detailTop.imgPoster);

        //Bottom
        detailItemBinding.detailBottom.tvOverview.setText(results.getOverview());
    }
}
