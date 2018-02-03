package xyz.hsuyeemon.tedtalk.activities;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import xyz.hsuyeemon.tedtalk.R;
import xyz.hsuyeemon.tedtalk.adapters.TedTalkFragmentAdapter;
import xyz.hsuyeemon.tedtalk.fragments.MyTalkFragment;
import xyz.hsuyeemon.tedtalk.fragments.PlaylistsFragment;
import xyz.hsuyeemon.tedtalk.fragments.PodcastsFragment;
import xyz.hsuyeemon.tedtalk.fragments.TalksFragment;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.vp_main_content)
    ViewPager vpMainContent;

    @BindView(R.id.tb_ted_talk)
    TabLayout tbTedTalk;



    private TedTalkFragmentAdapter mTedTalkAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this,this);
        setSupportActionBar(toolbar);


        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle(R.string.home_title);

        }

        mTedTalkAdapter = new TedTalkFragmentAdapter(getSupportFragmentManager());
        vpMainContent.setAdapter(mTedTalkAdapter);

        mTedTalkAdapter.addTab("Talks",new TalksFragment());
        mTedTalkAdapter.addTab("Playlists",new PlaylistsFragment());
        mTedTalkAdapter.addTab("Podcasts",new PodcastsFragment());
        mTedTalkAdapter.addTab("My Talks",new MyTalkFragment());


        tbTedTalk.setupWithViewPager(vpMainContent);
        vpMainContent.setOffscreenPageLimit(mTedTalkAdapter.getCount());




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @OnClick(R.id.fab)
    public void onFabTapped(View view){
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
