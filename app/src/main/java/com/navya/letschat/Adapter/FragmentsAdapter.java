package com.navya.letschat.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.navya.letschat.Fragments.CallsFragment;
import com.navya.letschat.Fragments.ChatsFragments;
import com.navya.letschat.Fragments.StatusFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {


    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ChatsFragments();
            case 1:
                return new StatusFragment();
            case 2:
                return new CallsFragment();
            default:
                return new ChatsFragments();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String Title = null;
        if (position == 0) {
            Title = "CHATS";
        }
        if (position == 1) {
            Title = "STATUS";
        }
        if (position == 2) {
            Title = "CALLS";
        }
        return Title;
    }
}