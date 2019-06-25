package id.afdaldev.submissionone.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.databinding.DataBindingUtil;

import java.util.ArrayList;

import id.afdaldev.submissionone.DetailActivity;
import id.afdaldev.submissionone.R;
import id.afdaldev.submissionone.databinding.ListItemBinding;
import id.afdaldev.submissionone.model.MovieModel;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<MovieModel> movie;

    public void setMovie(ArrayList<MovieModel> movie) {
        this.movie = movie;
    }

    public CustomAdapter(Context context) {
        this.context = context;
        movie= new ArrayList<>();
    }

    @Override
    public int getCount() {
        return movie.size();
    }

    @Override
    public Object getItem(int position) {
        return movie.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView= LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }
        ViewHolder viewHolder = new ViewHolder(convertView);
        final MovieModel movie = (MovieModel) getItem(position);
        viewHolder.bind(movie);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("movie", movie);
                context.startActivity(intent);
            }
        });
        return convertView;
    }

    private class ViewHolder {

        ListItemBinding listItemBinding;

        ViewHolder(View view){
            listItemBinding= DataBindingUtil.bind(view);
        }

        void bind(MovieModel movie){
            listItemBinding.tvTitle.setText(movie.getTitle());
            listItemBinding.tvOverview.setText(movie.getOverview());
            listItemBinding.imgLogo.setImageResource(movie.getPhoto());
        }
    }
}
