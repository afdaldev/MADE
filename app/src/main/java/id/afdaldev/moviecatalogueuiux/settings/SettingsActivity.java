package id.afdaldev.moviecatalogueuiux.settings;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import id.afdaldev.moviecatalogueuiux.MainActivity;
import id.afdaldev.moviecatalogueuiux.R;
import id.afdaldev.moviecatalogueuiux.databinding.ActivitySettingsBinding;

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
        reCreateActivity();
        return super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        reCreateActivity();
    }

    private void reCreateActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        recreate();
        startActivity(intent);
    }
}
