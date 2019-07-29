package id.afdaldev.moviecatalogueapi.ui;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import id.afdaldev.moviecatalogueapi.R;
import id.afdaldev.moviecatalogueapi.ui.movie.MoviesFragment;
import id.afdaldev.moviecatalogueapi.ui.tv.TVFragment;

public class FragmentPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter {

    private Context context;

    public FragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MoviesFragment();
            case 1:
                return new TVFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getString(R.string.movies);
            case 1:
                return context.getString(R.string.tv_show);
        }
        return null;
    }
}
