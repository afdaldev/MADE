package id.afdaldev.moviecatalogueuiux.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

public class PrefUtil {
    private static final String PREF_SETTINGS_LANGUAGE = "pref_settings_language";
    public static String getLocale(Context context){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);

        String loadLanguage = sharedPreferences.getString(PREF_SETTINGS_LANGUAGE, "");
        Log.d("LoadLanguage", loadLanguage);
        return loadLanguage;
    }
}
