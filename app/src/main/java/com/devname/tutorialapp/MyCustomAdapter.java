package com.devname.tutorialapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyCustomAdapter extends ArrayAdapter<String> {

    private final int resId;
    private final List<String> data;
    private static final String TAG = "MyCustomAdapter";

    public MyCustomAdapter(@NonNull Context context, int resource,@NonNull List<String> objects) {
        super(context, resource, objects);
        resId=resource;
        this.data=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resId,
                parent, false);
        view.findViewById(R.id.new_btn).setOnClickListener(v-> Log.d(TAG, "getView: "));
        TextView textView=view.findViewById(R.id.my_tv);
        textView.setText(data.get(position));

        return view;
    }


}
