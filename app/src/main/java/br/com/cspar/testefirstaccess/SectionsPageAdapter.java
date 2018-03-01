package br.com.cspar.testefirstaccess;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by tiagoalencar on 03/01/18.
 */

public class SectionsPageAdapter extends FragmentPagerAdapter {

    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Fragment fragment1 = new FragmentMain();
        Fragment fragment2 = new SecondFragment();
        Fragment fragment3 = new ThirdFragment();
        Fragment fragment4 = new FinishFragment();
        if (position == 0) {


            return fragment1;
        } else if (position == 1) {


            return fragment2;
        } else if (position == 2) {


            return fragment3;
        } else if (position == 3) {


            return fragment4;
        } else {
            return fragment1;
        }

        //PlaceholderFragment.newInstance(position + 1);
        //pushFragment(fragment);

    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }
}
