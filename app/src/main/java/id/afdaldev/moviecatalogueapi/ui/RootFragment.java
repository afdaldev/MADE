package id.afdaldev.moviecatalogueapi.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.afdaldev.moviecatalogueapi.R;
import id.afdaldev.moviecatalogueapi.databinding.FragmentRootBinding;
import id.afdaldev.moviecatalogueapi.ui.adapter.FragmentPagerAdapter;

public class RootFragment extends Fragment {

    private FragmentRootBinding mFragment;

    static RootFragment rootFragment() {
        return new RootFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mFragment = DataBindingUtil.inflate(inflater, R.layout.fragment_root, container, false);
        initView();
        return mFragment.getRoot();
    }

    private void initView() {
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Movie Catalogue");
        mFragment.viewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager(), getActivity()));
        mFragment.tabLayout.setupWithViewPager(mFragment.viewPager);
    }
}
