package id.afdaldev.moviecatalogueuiux.tvshow;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import id.afdaldev.moviecatalogueuiux.R;
import id.afdaldev.moviecatalogueuiux.databinding.ListItemBinding;
import id.afdaldev.moviecatalogueuiux.model.Model;

public class TvShowAdapter extends RecyclerView.Adapter<TvShowAdapter.ViewHolder> {

    private ArrayList<Model> tvShowModelList;
    private Context mContext;

    public TvShowAdapter(ArrayList<Model> tvShowModelList, Context mContext) {
        this.tvShowModelList = tvShowModelList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Model tvShow = tvShowModelList.get(position);

        holder.listItemBinding.tvTitleItem.setText(tvShow.getTitle());
        holder.listItemBinding.tvOverviewItem.setText(tvShow.getOverview());
        Glide.with(mContext)
                .load(tvShow.getPhoto())
                .into(holder.listItemBinding.imgItem);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, TvShowDetailActivity.class);
                intent.putExtra("tv_show", tvShow);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tvShowModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ListItemBinding listItemBinding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            listItemBinding = DataBindingUtil.bind(itemView);
        }
    }
}
