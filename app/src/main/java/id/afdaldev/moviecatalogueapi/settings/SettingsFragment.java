package id.afdaldev.moviecatalogueapi.settings;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;

import androidx.annotation.Nullable;

import id.afdaldev.moviecatalogueapi.R;

public class SettingsFragment extends PreferenceFragment {

    public static final String LANGUAGE_KEY = "language_key";
    private SharedPreferences.OnSharedPreferenceChangeListener preferenceChangeListener;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings_pref);

        preferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() {
            @Override
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
                if (key.equals(LANGUAGE_KEY)) {
                    Preference languagePreference = findPreference(key);
                    languagePreference.setSummary(sharedPreferences.getString(key, ""));
                }
            }
        };
    }

    @Override
    public void onResume() {
        super.onResume();
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(preferenceChangeListener);
        Preference languagePref = findPreference(LANGUAGE_KEY);
        languagePref.setSummary(getPreferenceScreen().getSharedPreferences().getString(LANGUAGE_KEY, ""));
    }

    @Override
    public void onPause() {
        super.onPause();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(preferenceChangeListener);
    }
}
