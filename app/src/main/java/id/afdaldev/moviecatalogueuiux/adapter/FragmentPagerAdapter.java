package id.afdaldev.moviecatalogueuiux.adapter;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import id.afdaldev.moviecatalogueuiux.R;
import id.afdaldev.moviecatalogueuiux.movies.MoviesFragment;
import id.afdaldev.moviecatalogueuiux.tvshow.TvShowFragment;

public class FragmentPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter {

    private Context mContext;

    public FragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MoviesFragment();
            case 1:
                return new TvShowFragment();
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
                return mContext.getString(R.string.movie);
            case 1:
                return mContext.getString(R.string.tv_show);
        }
        return null;
    }
}
