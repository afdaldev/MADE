package id.afdaldev.moviecatalogueapi.ui.tvshow;


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
import id.afdaldev.moviecatalogueapi.data.model.TVShowResponse;
import id.afdaldev.moviecatalogueapi.databinding.FragmentMainBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class TVFragment extends Fragment {

    private FragmentMainBinding fragmentMainBinding;
    private TVAdapter adapter;
    private List<TVShowResponse.Results> tvList = new ArrayList<>();


    public TVFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentMainBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        adapter = new TVAdapter(tvList);
        fragmentMainBinding.rvMovies.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        fragmentMainBinding.rvMovies.setAdapter(adapter);
        return fragmentMainBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showLoading(true);
        TVViewModel tvViewModel = ViewModelProviders.of(this).get(TVViewModel.class);
        tvViewModel.init(getActivity());
        tvViewModel.getTV().observe(this, new Observer<TVShowResponse>() {
            @Override
            public void onChanged(TVShowResponse tvShowResponse) {
                tvList.addAll(tvShowResponse.getResults());
                adapter.notifyDataSetChanged();
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
