package id.afdaldev.moviecatalogueuiux.tvshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import id.afdaldev.moviecatalogueuiux.R;
import id.afdaldev.moviecatalogueuiux.databinding.ActivityDetailBinding;
import id.afdaldev.moviecatalogueuiux.model.Model;

public class TvShowDetailActivity extends AppCompatActivity {

    private ActivityDetailBinding activityDetailBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        getDetail("tv_show");
    }

    private void getDetail(String data) {
        Model model = getIntent().getParcelableExtra(data);
        activityDetailBinding.imgBackdrop.setImageResource(model.getPhoto());
        activityDetailBinding.imgPoster.setImageResource(model.getPhoto());
        activityDetailBinding.tvTitle.setText(model.getTitle());
        activityDetailBinding.tvOverview.setText(model.getOverview());
    }
}
