package com.example.amine.nordikhackathonapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.amine.nordikhackathonapp.fragments.AgendaFragment;
import com.example.amine.nordikhackathonapp.fragments.MeetingResourcesFragment;
import com.example.amine.nordikhackathonapp.fragments.VideoFragment;

/**
 * Created by amine on 24/02/2018.
 */

public class AppSectionsPagerAdapter extends FragmentPagerAdapter {


    Fragment[] fragmentList;


    public AppSectionsPagerAdapter(FragmentManager fm) {
        super(fm);

        fragmentList = new Fragment[3];

        fragmentList[0] = new AgendaFragment();
        fragmentList[1] = new VideoFragment();
        fragmentList[2] = new MeetingResourcesFragment();
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList[i];

        /*
        switch (i) {
            case 0:
                // The first section of the app is the most interesting -- it offers
                // a launchpad into the other demonstrations in this example application.
                return new LaunchpadSectionFragment();

            default:
                // The other sections of the app are dummy placeholders.
                Fragment fragment = new DummySectionFragment();
                Bundle args = new Bundle();
                args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, i + 1);
                fragment.setArguments(args);
                return fragment;
        }*/
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Section " + (position + 1);
    }
}
