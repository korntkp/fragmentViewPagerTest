package com.zackoji.fragmentviewpagertest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Zackoji on 29/6/2558.
 */
public class TwoFragment extends Fragment {

    public static TwoFragment newInstance() {
        TwoFragment fragment = new TwoFragment();
        return fragment;
    }

    public TwoFragment() { }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_two, container, false);
        return rootView;
    }
}
