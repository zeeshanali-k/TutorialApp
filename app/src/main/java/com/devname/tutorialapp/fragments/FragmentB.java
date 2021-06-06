package com.devname.tutorialapp.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devname.tutorialapp.R;

public class FragmentB extends Fragment {

    public FragmentB() {
        // Required empty public constructor
    }

    public static FragmentB newInstance(String param1, String param2) {
        FragmentB fragment = new FragmentB();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private static final String TAG = "FragmentB";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

//        if (getArguments()!=null)
//        String key = getArguments().getString("key");
//        Log.d(TAG, "onCreateView: "+key);

        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.fragment_b_back)
                .setOnClickListener(v-> NavHostFragment.findNavController(this)
                .navigate(R.id.action_fragmentB_to_fragmentA)
                );
    }

}