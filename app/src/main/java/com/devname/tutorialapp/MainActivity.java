package com.devname.tutorialapp;

import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    private String text;
    private EditText editText;
    private SwitchMaterial mySwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.etv);
        mySwitch = findViewById(R.id.switch1);
        mySwitch.isChecked();
        mySwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Log.d(TAG, "onCheckedChanged: " + isChecked);
            ViewGroup viewGroup = findViewById(R.id.root);
            TransitionManager.beginDelayedTransition(viewGroup,new AutoTransition());
            if (isChecked)
                editText.setVisibility(View.GONE);
            else {
                editText.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            text = editText.getText().toString();
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("text", text);
            startActivity(intent);
        }
    }


}
