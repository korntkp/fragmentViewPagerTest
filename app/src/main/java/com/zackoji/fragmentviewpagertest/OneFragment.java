package com.zackoji.fragmentviewpagertest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by Zackoji on 29/6/2558.
 */
public class OneFragment extends Fragment {
    TextView textView1;


    /*
    private static final String KEY_STRING = "key_string";
    public static OneFragment newInstance(String str) {
        OneFragment fragment = new OneFragment();
        Bundle bundle = new Bundle();
        bundle.putString(KEY_STRING, str);
        return fragment;
    }
    */

    public static OneFragment newInstance() {
        OneFragment fragment = new OneFragment();
        return fragment;
    }

    public OneFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        textView1 = (TextView)rootView.findViewById(R.id.textView1);
        return rootView;
    }

    public String getMyText(){
        return textView1.getText().toString();
    }

}
