package id.afdaldev.moviecatalogueuiux.tvshow;


import android.content.res.TypedArray;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import id.afdaldev.moviecatalogueuiux.R;
import id.afdaldev.moviecatalogueuiux.databinding.FragmentTvShowBinding;
import id.afdaldev.moviecatalogueuiux.model.Model;

/**
 * A simple {@link Fragment} subclass.
 */
public class TvShowFragment extends Fragment {

    private String[] title;
    private String[] overview;
    private TypedArray imgMovie;
    private ArrayList<Model> tvShow;

    public TvShowFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prepare();
        addItem();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentTvShowBinding fragmentTvShowBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_tv_show, container, false);
        fragmentTvShowBinding.rvTvShow.setLayoutManager(new LinearLayoutManager(getActivity()));

        TvShowAdapter adapter = new TvShowAdapter(tvShow, getActivity());
        fragmentTvShowBinding.rvTvShow.setAdapter(adapter);
        return fragmentTvShowBinding.getRoot();
    }

    private void addItem(){
        tvShow = new ArrayList<>();
        for (int i =0; i < title.length; i++){
            Model model = new Model();
            model.setTitle(title[i]);
            model.setOverview(overview[i]);
            model.setPhoto(imgMovie.getResourceId(i, -1));

            tvShow.add(model);
        }
    }

    private void prepare(){
        title = getResources().getStringArray(R.array.data_title_tv_show);
        overview = getResources().getStringArray(R.array.data_overview_tv_show);
        imgMovie = getResources().obtainTypedArray(R.array.data_image_tv_show);
    }

}
