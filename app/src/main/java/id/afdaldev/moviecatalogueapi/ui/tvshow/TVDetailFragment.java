package id.afdaldev.moviecatalogueapi.ui.tvshow;

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
import id.afdaldev.moviecatalogueapi.data.local.TmDb;
import id.afdaldev.moviecatalogueapi.data.local.tvshow.TVShowDao;
import id.afdaldev.moviecatalogueapi.data.model.TVShowResponse;
import id.afdaldev.moviecatalogueapi.databinding.DetailItemBinding;

public class TVDetailFragment extends Fragment {

    private DetailItemBinding detailItemBinding;
    public static String TV_KEY = "tv_key";

    private TVShowResponse.Results tvShow;
    private TmDb tmDb;
    private boolean isFavorite = false;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        detailItemBinding = DataBindingUtil.inflate(inflater, R.layout.detail_item, container, false);

        tmDb = TmDb.getDatabase(getActivity());
        getTVDetail();
        setHasOptionsMenu(true);
        return detailItemBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(tvShow.getName());

        isTVFavorite(tvShow.getId());
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
                deleteFromFavorite(tvShow.getId());
                isFavorite = false;
            } else {
                item.setIcon(R.drawable.ic_favorite);
                addToFavorite(tvShow);
                isFavorite = true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    private void getTVDetail(){
        detailItemBinding.pbDetail.setVisibility(View.VISIBLE);
        Bundle bundle = getArguments();
        tvShow = bundle.getParcelable(TV_KEY);
        detailItemBinding.pbDetail.setVisibility(View.GONE);

        //Top
        detailItemBinding.detailTop.titleSection.tvTitle.setText(tvShow.getName());
        detailItemBinding.detailTop.titleSection.ratingBar.setRating(Float.parseFloat(String.valueOf(Double.valueOf(tvShow.getVoteAverage() / 2))));
        detailItemBinding.detailTop.titleSection.chipPopularity.setText(String.valueOf(tvShow.getPopularity()));
        detailItemBinding.detailTop.titleSection.chipVote.setText(String.valueOf(tvShow.getVoteCount()));
        Glide.with(this)
                .load(Constants.BACKDROP_URL + tvShow.getBackdropPath())
                .into(detailItemBinding.detailTop.imgBackdrop);
        Glide.with(this)
                .load(Constants.POSTER_URL + tvShow.getPosterPath())
                .into(detailItemBinding.detailTop.imgPoster);

        //Bottom
        detailItemBinding.detailBottom.tvOverview.setText(tvShow.getOverview());
    }

    private void addToFavorite(TVShowResponse.Results tvShow) {
        TVShowDao tvShowDao = tmDb.tvShowDao();
        try {
            tvShowDao.insertTV(tvShow);
            Toast.makeText(getActivity(), "Add TV to Favorite", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("addError", e.getMessage());
        }
    }

    private void deleteFromFavorite(int id) {
        TVShowDao tvShowDao = tmDb.tvShowDao();
        try {
            tvShowDao.deleteTVById(id);
            Toast.makeText(getActivity(), "Delete TV from Favorite", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("deleteError", e.getMessage());
        }
    }

    private void isTVFavorite(int id) {
        TVShowDao tvShowDao = tmDb.tvShowDao();
        try {
            int count = tvShowDao.tvById(id);

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
