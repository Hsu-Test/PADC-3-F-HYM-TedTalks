package xyz.hsuyeemon.tedtalk.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 2/3/2018.
 */

public class TedTalkFragmentAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> mFragments;
    private List<String> mTabTitles;

    public TedTalkFragmentAdapter(FragmentManager fm) {
        super(fm);
        mFragments = new ArrayList<>();
        mTabTitles = new ArrayList<>();

    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }


    public void addTab(String tabTitle, Fragment fragment) {
        mTabTitles.add(tabTitle);
        mFragments.add(fragment);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {  //return title
        return mTabTitles.get(position);
    }
}
