package id.afdaldev.moviecatalogueuiux;

import androidx.databinding.DataBindingUtil;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import id.afdaldev.moviecatalogueuiux.adapter.FragmentPagerAdapter;
import id.afdaldev.moviecatalogueuiux.databinding.ActivityMainBinding;
import id.afdaldev.moviecatalogueuiux.settings.SettingsActivity;
import id.afdaldev.moviecatalogueuiux.utils.LanguageUtil;

public class MainActivity extends BaseActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initView();

    }

    @Override
    protected void onResume() {
        super.onResume();
        LanguageUtil.setLocale(this);
    }

    private void initView() {
        activityMainBinding.viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager(), this));
        activityMainBinding.tabLayout.setupWithViewPager(activityMainBinding.viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.settings) {
            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
