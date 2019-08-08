package id.afdaldev.moviecatalogueapi.ui.tvshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;

import java.util.ArrayList;
import java.util.List;

import id.afdaldev.moviecatalogueapi.R;
import id.afdaldev.moviecatalogueapi.data.model.TVShowResponse;
import id.afdaldev.moviecatalogueapi.databinding.FragmentMainBinding;

public class TVShowFavoriteFragment extends Fragment {

    private FragmentMainBinding fragmentMainBinding;
    private List<TVShowResponse.Results> tvList = new ArrayList<>();
    private TVAdapter tvAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentMainBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        fragmentMainBinding.rvMovies.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        tvAdapter = new TVAdapter(tvList);
        fragmentMainBinding.rvMovies.setAdapter(tvAdapter);
        return fragmentMainBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showLoading(true);
        TVViewModel tvViewModel = ViewModelProviders.of(this).get(TVViewModel.class);
        tvViewModel.initFavorite(getActivity());
        tvViewModel.getAllTVFromLocal().observe(this, new Observer<List<TVShowResponse.Results>>() {
            @Override
            public void onChanged(List<TVShowResponse.Results> results) {
                tvList.clear();
                tvList.addAll(results);
                tvAdapter.notifyDataSetChanged();
                showLoading(false);
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
