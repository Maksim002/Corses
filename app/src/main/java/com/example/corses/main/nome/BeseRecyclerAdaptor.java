package com.example.corses.main.nome;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public abstract class BeseRecyclerAdaptor<V extends BesViewHolder, T> extends RecyclerView.Adapter<V> {
    private List<T> data = new ArrayList<>();
    @NonNull
    @Override
    public V onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(getLayoutRes(), parent, false);
        return getViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull V holder, int position) {
        holder.bind(getItemAt(position));
    }
    private T getItemAt(int position){
        return data.get(position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public void onViewRecycled(@NonNull V holder) {
        super.onViewRecycled(holder);
        holder.unxbind();
    }

    @LayoutRes
    protected abstract int getLayoutRes();

    protected abstract V getViewHolder(View view);

    public void updeta(List<T> newList){
        this.data = newList;
        notifyDataSetChanged();
    }
}
