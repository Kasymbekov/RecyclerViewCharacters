package com.example.recyclerviewcharacters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CharacterViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView textView;
    private TextView textView2;

    public CharacterViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.logo);
        textView = itemView.findViewById(R.id.character_name);
        textView2 = itemView.findViewById(R.id.ability);
    }

    public void bind(int img, String tv, String tv2) {
        imageView.setImageResource(img);
        textView.setText(tv);
        textView2.setText(tv2);
    }
}
