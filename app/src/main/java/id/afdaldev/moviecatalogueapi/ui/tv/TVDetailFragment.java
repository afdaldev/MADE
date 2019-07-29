package id.afdaldev.moviecatalogueapi.ui.tv;

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
import id.afdaldev.moviecatalogueapi.data.model.TVShowResponse;
import id.afdaldev.moviecatalogueapi.databinding.DetailItemBinding;

public class TVDetailFragment extends Fragment {

    DetailItemBinding detailItemBinding;
    public static String TV_KEY = "tv_key";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        detailItemBinding = DataBindingUtil.inflate(inflater, R.layout.detail_item, container, false);
        getTVDetail();
        return detailItemBinding.getRoot();
    }

    private void getTVDetail(){
        detailItemBinding.pbDetail.setVisibility(View.VISIBLE);
        Bundle bundle = getArguments();
        TVShowResponse.Results results = bundle.getParcelable(TV_KEY);
        detailItemBinding.pbDetail.setVisibility(View.GONE);

        //Top
        detailItemBinding.detailTop.titleSection.tvTitle.setText(results.getName());
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
