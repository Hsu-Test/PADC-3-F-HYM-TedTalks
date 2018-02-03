package xyz.hsuyeemon.tedtalk.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.hsuyeemon.tedtalk.R;
import xyz.hsuyeemon.tedtalk.adapters.PlaylistsAdapter;

/**
 * Created by Dell on 2/3/2018.
 */

public class PlaylistsFragment extends Fragment {


    @BindView(R.id.rv_playlists)
    RecyclerView rvPlaylists;

    private PlaylistsAdapter mAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_playlists,container,false);

        ButterKnife.bind(this,view);

        mAdapter = new PlaylistsAdapter();
        LinearLayoutManager lm = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        rvPlaylists.setLayoutManager(lm);
        rvPlaylists.setAdapter(mAdapter);

        return view;
    }
}
