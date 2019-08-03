package com.example.corses.main.nome;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.example.corses.R;
import com.example.corses.model.Cours;

public class CourseViewHolder extends BesViewHolder<Cours> {
    private ImageView imageView;
    private TextView title;
    private TextView desription;

    public CourseViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        title = itemView.findViewById(R.id.titleTextSize);
        desription = itemView.findViewById(R.id.descriptionTextSize);
    }

    @Override
    protected void bind(Cours item) {
        Glide.with(itemView)
                .load(item.getMainImageUrl())
                .into(imageView);
        title.setText(item.getTitle());
        desription.setText(item.getLogoImageUrl());
    }

    @Override
    protected void unxbind() {
        Glide.with(itemView ).clear(imageView);

    }
}
