package id.afdaldev.moviecatalogueapi.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import id.afdaldev.moviecatalogueapi.settings.SettingsFragment;

public class LanguagePref {
    public static String getSettings(Context context){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String languagePref = sharedPreferences.getString(SettingsFragment.LANGUAGE_KEY, "0");
        return languagePref;
    }
}
