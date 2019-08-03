package com.example.corses.main.nome;

import android.view.View;

import com.example.corses.R;
import com.example.corses.model.Cours;

public class HomeAdapter extends BeseRecyclerAdaptor<CourseViewHolder, Cours> {
    @Override
    protected int getLayoutRes() {
        return R.layout.list_cours;
    }

    @Override
    protected CourseViewHolder getViewHolder(View view) {
        return new CourseViewHolder(view);
    }
}
