package xyz.hsuyeemon.tedtalk.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.hsuyeemon.tedtalk.R;
import xyz.hsuyeemon.tedtalk.viewholders.ItemTalkViewHolder;

/**
 * Created by Dell on 2/3/2018.
 */

public class TalkAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_talks,parent,false);
        ItemTalkViewHolder itemTalkViewHolder = new ItemTalkViewHolder(view);
        return itemTalkViewHolder;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
