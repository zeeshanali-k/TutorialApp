package com.devname.tutorialapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.devname.tutorialapp.viewmodels.FragmentsViewModel;

public class FragmentsActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "FragmentsActivity";
    private FragmentsViewModel fragmentsViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);
        fragmentsViewModel = new ViewModelProvider(this)
                .get(FragmentsViewModel.class);

        MutableLiveData<Integer> integerLiveData = fragmentsViewModel.getIntegerLiveData();
        integerLiveData.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                Log.d(TAG, "onChanged: "+integer.toString());
            }
        });

    }

    @Override
    public void onClick(View v) {
        fragmentsViewModel.setA(5);
    }
}