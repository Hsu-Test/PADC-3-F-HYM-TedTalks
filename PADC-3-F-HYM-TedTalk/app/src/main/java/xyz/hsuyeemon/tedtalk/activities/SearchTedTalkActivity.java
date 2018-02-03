package xyz.hsuyeemon.tedtalk.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import xyz.hsuyeemon.tedtalk.R;

/**
 * Created by Dell on 2/3/2018.
 */

public class SearchTedTalkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_ted_talk);

        ButterKnife.bind(this,this);
        
    }
}
