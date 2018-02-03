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
import xyz.hsuyeemon.tedtalk.adapters.TalkAdapter;

/**
 * Created by Dell on 2/3/2018.
 */

public class TalksFragment extends Fragment {

    @BindView(R.id.rv_talks)
    RecyclerView rvTalks;

    private TalkAdapter mTalkAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_talks,container,false);
        ButterKnife.bind(this,view);

        mTalkAdapter = new TalkAdapter();
        LinearLayoutManager lm = new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL,false);
        rvTalks.setLayoutManager(lm);
        rvTalks.setAdapter(mTalkAdapter);

        return view;

    }

}
