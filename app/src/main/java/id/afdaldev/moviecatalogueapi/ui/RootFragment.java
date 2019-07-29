package id.afdaldev.moviecatalogueapi.ui;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.afdaldev.moviecatalogueapi.R;
import id.afdaldev.moviecatalogueapi.databinding.FragmentRootBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class RootFragment extends Fragment {

    private FragmentRootBinding fragmentRootBinding;


    public static RootFragment rootFragment() {
        return new RootFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentRootBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_root, container, false);
        initView();
        return fragmentRootBinding.getRoot();
    }

    private void initView(){
        fragmentRootBinding.viewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager(), getActivity()));
        fragmentRootBinding.tabLayout.setupWithViewPager(fragmentRootBinding.viewPager);
    }
}
