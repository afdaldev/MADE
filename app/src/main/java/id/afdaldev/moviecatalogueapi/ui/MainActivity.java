package id.afdaldev.moviecatalogueapi.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import id.afdaldev.moviecatalogueapi.R;
import id.afdaldev.moviecatalogueapi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = DataBindingUtil.setContentView(this, R.layout.activity_main);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, RootFragment.rootFragment())
                    .commitNow();
        }
    }
}
