package id.afdaldev.moviecatalogueapi.ui.tvshow;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.palette.graphics.Palette;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.bumptech.glide.request.transition.Transition;

import java.util.List;

import id.afdaldev.moviecatalogueapi.R;
import id.afdaldev.moviecatalogueapi.common.Constants;
import id.afdaldev.moviecatalogueapi.data.model.TVShowResponse;
import id.afdaldev.moviecatalogueapi.databinding.ListItemBinding;

public class TVAdapter extends RecyclerView.Adapter<TVAdapter.TVViewHolder> {

    private List<TVShowResponse.Results> tvResponseList;
    private Context context;

    public TVAdapter(List<TVShowResponse.Results> tvResponseList) {
        this.tvResponseList = tvResponseList;
    }

    @NonNull
    @Override
    public TVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new TVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final TVViewHolder holder, int position) {
        final TVShowResponse.Results tvResponse = tvResponseList.get(position);
        holder.listItemBinding.tvTitle.setText(tvResponse.getName());
        Glide.with(context)
                .asBitmap()
                .load(Constants.POSTER_URL + tvResponse.getPosterPath())
                .into(new BitmapImageViewTarget(holder.listItemBinding.imgPoster) {
                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                        super.onResourceReady(resource, transition);

                        Palette.from(resource).generate(new Palette.PaletteAsyncListener() {
                            @Override
                            public void onGenerated(@Nullable Palette palette) {
                                holder.listItemBinding.viewBackgroundTitle.setBackgroundColor(
                                        palette.getDarkVibrantColor(context.getResources().getColor(android.R.color.darker_gray)));
                            }
                        });
                    }
                });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TVDetailFragment tvDetailFragment = new TVDetailFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable(TVDetailFragment.TV_KEY, tvResponse);
                tvDetailFragment.setArguments(bundle);

                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                activity.getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, tvDetailFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return tvResponseList.size();
    }

    public class TVViewHolder extends RecyclerView.ViewHolder {

        ListItemBinding listItemBinding;

        public TVViewHolder(@NonNull View itemView) {
            super(itemView);
            listItemBinding = DataBindingUtil.bind(itemView);
        }
    }
}
