package id.afdaldev.moviecatalogueuiux.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.preference.PreferenceManager;

import java.util.Locale;

public class LanguageUtil {

    private static final String LANGUAGE_KEY = "language_key";

    private static String getLanguage(Context context){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPreferences.getString(LANGUAGE_KEY, "");
    }

    public static Context setLocale(Context context){
        return updateResource(context, getLanguage(context));
    }

    private static Context updateResource(Context context, String language){
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return context;
    }
}