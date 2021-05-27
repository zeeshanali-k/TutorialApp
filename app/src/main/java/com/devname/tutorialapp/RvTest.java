package com.devname.tutorialapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.devname.tutorialapp.databinding.AbcBinding;

public class RvTest extends RecyclerView.Adapter<RvTest.RvHolder> {

    @NonNull
    @Override
    public RvHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        AbcBinding abcBinding = AbcBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new RvHolder(abcBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull RvTest.RvHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class RvHolder extends RecyclerView.ViewHolder {

        private final AbcBinding abcBinding;

        public RvHolder(@NonNull AbcBinding abcBinding) {
            super(abcBinding.getRoot());
            this.abcBinding =abcBinding;

        }
    }

}
