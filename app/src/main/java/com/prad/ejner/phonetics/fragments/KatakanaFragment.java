package com.prad.ejner.phonetics.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prad.ejner.phonetics.R;
import com.prad.ejner.phonetics.views.KatakanaView;

/**
 * @author Prad Ejner
 * @date 10/29/2016
 */

public class KatakanaFragment extends Fragment {
    private static final String TAG = KatakanaFragment.class.getName();
    private View view;
    private KatakanaView katakanaView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.katakana_phonetics_setup, container, true);

        try {
            katakanaView = (KatakanaView) view.findViewById(R.id.katakana_layout);
        }
        catch (InflateException e) {
            Log.e(TAG, "onCreateView: ", e);
        }
        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onStart();

    }

    public void onStop() {
        super.onStart();
    }
}