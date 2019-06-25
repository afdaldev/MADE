package id.afdaldev.submissionone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import id.afdaldev.submissionone.databinding.ActivityDetailBinding;
import id.afdaldev.submissionone.model.MovieModel;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding activityDetailBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        if (getSupportActionBar() != null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        MovieModel movies = getIntent().getParcelableExtra("movie");
        activityDetailBinding.tvTitle.setText(movies.getTitle());
        activityDetailBinding.tvOverview.setText(movies.getOverview());
        activityDetailBinding.imgMoviePoster.setImageResource(movies.getPhoto());
        activityDetailBinding.imgMovieBackdrop.setImageResource(movies.getPhoto());
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
