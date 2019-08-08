package id.afdaldev.moviecatalogueapi.pref;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import id.afdaldev.moviecatalogueapi.R;
import id.afdaldev.moviecatalogueapi.databinding.ActivitySettingsBinding;
import id.afdaldev.moviecatalogueapi.ui.MainActivity;

public class SettingsActivity extends AppCompatActivity {

    ActivitySettingsBinding activitySettingsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySettingsBinding = DataBindingUtil.setContentView(this, R.layout.activity_settings);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        if (activitySettingsBinding.fragmentContainer != null){
            if (savedInstanceState != null)
                return;
            getFragmentManager().beginTransaction().add(R.id.fragment_container, new SettingsFragment()).commit();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        reCreateActivityToChangeLanguage();
        return super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        reCreateActivityToChangeLanguage();
    }

    private void reCreateActivityToChangeLanguage(){
        Intent intent = new Intent(this, MainActivity.class);
        recreate();
        startActivity(intent);
    }
}
