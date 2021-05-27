package com.devname.tutorialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getIntent().getExtras().getParcelable(Constants.OBJ_KEY);

        /*ViewGroup viewGroup=findViewById(R.id.scnd_root);
        View newView = LayoutInflater.from(this)
                .inflate(R.layout.item, viewGroup,
                        false);

        Button button=newView.findViewById(R.id.new_btn);
        button.setOnClickListener(v-> Log.d(TAG, "onCreate: "));

        viewGroup.addView(newView);*/
        List<String> strings=new ArrayList<>();
        strings.add("Abc");
        strings.add("Def");
        strings.add("Ghi");

        ListView listView=findViewById(R.id.lv);
//        listView.setAdapter(new ArrayAdapter<>(getApplicationContext(),
//                R.layout.item,R.id.my_tv, strings));
        listView.setAdapter(new MyCustomAdapter(getApplicationContext(),R.layout.item,
                strings));

    }
}