package com.devname.tutorialapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.devname.tutorialapp.databinding.ActivityMainBinding;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    private String text;
    private EditText editText;
    private SwitchMaterial mySwitch;
    private ActivityResultLauncher<Intent> launcher;
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        setSupportActionBar(activityMainBinding.toolbar);

        activityMainBinding.etv.setText("asdasda");
        activityMainBinding.button.setText("asdasda");
//        editText = findViewById(R.id.etv);
//        mySwitch = findViewById(R.id.switch1);
//        mySwitch.isChecked();
//        mySwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
//            Log.d(TAG, "onCheckedChanged: " + isChecked);
//            ViewGroup viewGroup = findViewById(R.id.root);
//            TransitionManager.beginDelayedTransition(viewGroup,new AutoTransition());
//            if (isChecked)
//                editText.setVisibility(View.GONE);
//            else {
//                editText.setVisibility(View.VISIBLE);
//            }
//        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.toast_menu_btn){
            Toast.makeText(getApplicationContext(),"hi",
                    Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            Intent intent=new Intent(this,MainActivity.class);
            launcher.launch(intent);
        }
    }

}
