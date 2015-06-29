package com.zackoji.fragmentviewpagertest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Zackoji on 29/6/2558.
 */
public class ThreeFragment extends Fragment {
    TextView textView1;

    public static ThreeFragment newInstance() {
        ThreeFragment fragment = new ThreeFragment();
        return fragment;
    }

    public ThreeFragment() { }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_three, container, false);

        textView1 = (TextView)rootView.findViewById(R.id.textView1);

        return rootView;
    }

    public String getMyText(){
        return textView1.getText().toString();
    }
}
