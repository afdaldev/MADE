package id.afdaldev.moviecatalogueapi.ui;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import id.afdaldev.moviecatalogueapi.R;
import id.afdaldev.moviecatalogueapi.databinding.FragmentRootBinding;
import id.afdaldev.moviecatalogueapi.pref.SettingsActivity;

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
        setHasOptionsMenu(true);
        return fragmentRootBinding.getRoot();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
       if (id == R.id.settings) {
            Intent intent = new Intent(getActivity(), SettingsActivity.class);
            startActivity(intent);
            return true;        }
        return super.onOptionsItemSelected(item);
    }

    private void initView(){
        fragmentRootBinding.viewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager(), getActivity()));
        fragmentRootBinding.tabLayout.setupWithViewPager(fragmentRootBinding.viewPager);
    }
}
