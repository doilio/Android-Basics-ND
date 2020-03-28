package com.doiliomatsinhe.tourguide.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.doiliomatsinhe.tourguide.R;
import com.doiliomatsinhe.tourguide.ui.gym.GymFragment;
import com.doiliomatsinhe.tourguide.ui.places.PlacesFragment;
import com.doiliomatsinhe.tourguide.ui.restaurants.RestaurantsFragment;
import com.doiliomatsinhe.tourguide.ui.hotels.HotelsFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.restaurants, R.string.hotels, R.string.places, R.string.gyms};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1) {
            return new HotelsFragment();
        } else if (position == 2) {
            return new PlacesFragment();
        } else {
            return new GymFragment();
        }

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 4;
    }
}