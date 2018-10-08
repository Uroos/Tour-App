package com.example.home.tourappone;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Home on 11/26/2017.
 */

public class ContentAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private Context mContext;

    public ContentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MustSeeFragment();
        } else if (position == 1) {
            return new ParksFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new ShoppingFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return mContext.getString(R.string.category_mustsee);
        else if (position == 1)
            return mContext.getString(R.string.category_parks);
        else if (position == 2)
            return mContext.getString(R.string.category_restaurants);
        else
            return mContext.getString(R.string.category_shopping);
    }
}
