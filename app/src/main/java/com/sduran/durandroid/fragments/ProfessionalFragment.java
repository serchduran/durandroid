package com.sduran.durandroid.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sduran.durandroid.R;

/**
 * Created by sduranware on 23/09/2017.
 */

public class ProfessionalFragment extends Fragment {

    public ProfessionalFragment() {
        // Required empty public constructor
    }

    public static ProfessionalFragment newInstance(String param1, String param2) {
        ProfessionalFragment fragment = new ProfessionalFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_professional, container, false);
    }
}
