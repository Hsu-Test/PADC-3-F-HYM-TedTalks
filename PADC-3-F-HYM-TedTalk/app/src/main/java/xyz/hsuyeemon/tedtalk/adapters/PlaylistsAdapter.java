package xyz.hsuyeemon.tedtalk.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.hsuyeemon.tedtalk.R;
import xyz.hsuyeemon.tedtalk.viewholders.ItemPlaylistsViewHolder;

/**
 * Created by Dell on 2/3/2018.
 */

public class PlaylistsAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_playlists,parent,false);
        ItemPlaylistsViewHolder itemPlaylistsViewHolder = new ItemPlaylistsViewHolder(view);
        return  itemPlaylistsViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
