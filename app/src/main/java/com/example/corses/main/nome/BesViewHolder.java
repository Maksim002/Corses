package com.example.corses.main.nome;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BesViewHolder<T> extends RecyclerView.ViewHolder {
    public BesViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    protected abstract void bind(T item);
    protected abstract void unxbind();
}
