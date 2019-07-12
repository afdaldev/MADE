package id.afdaldev.moviecatalogueuiux;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import id.afdaldev.moviecatalogueuiux.utils.LanguageUtil;

public class MovieLanguageApp extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LanguageUtil.setLocale(base));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        LanguageUtil.setLocale(this);
    }
}
