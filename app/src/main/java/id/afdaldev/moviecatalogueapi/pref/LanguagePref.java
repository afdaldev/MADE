package id.afdaldev.moviecatalogueapi.pref;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class LanguagePref {
//    public static String getSettings(Context context){
//        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
//        String languagePref = sharedPreferences.getString(SettingsFragment.LANGUAGE_KEY, "0");
//        return languagePref;
//    }

    //Review
    public static String getSettings(Context context){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPreferences.getString(SettingsFragment.LANGUAGE_KEY, "0");
    }
}
