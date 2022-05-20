package com.example.healthtipstricks;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    public ImageView img;
    public TextView title;

     public ItemViewHolder(@NonNull View itemView) {
        super(itemView);

        img= itemView.findViewById(R.id.img);
        title=itemView.findViewById(R.id.title);

    }
}
