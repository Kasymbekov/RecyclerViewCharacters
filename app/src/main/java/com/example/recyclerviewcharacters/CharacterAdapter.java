package com.example.recyclerviewcharacters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterViewHolder> {

    private ArrayList<String> data1, data2;
    private int[] data3;

    public CharacterAdapter(ArrayList<String> data1, ArrayList<String> data2, int[] data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CharacterViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_character, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
        holder.bind(data3[position], data1.get(position), data2.get(position));
    }

    @Override
    public int getItemCount() {
        return data1.size();
    }
}
