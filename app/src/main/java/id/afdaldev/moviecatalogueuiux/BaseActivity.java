package id.afdaldev.moviecatalogueuiux;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import id.afdaldev.moviecatalogueuiux.utils.LanguageUtil;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LanguageUtil.setLocale(newBase));
    }
}
