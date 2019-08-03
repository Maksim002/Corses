package com.example.corses.main.nome;


import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.corses.R;
import com.example.corses.Util.Util;
import com.example.corses.base.BeseFragment;
import com.example.corses.model.Corses;

public class HomeFragment extends BeseFragment {
    private RecyclerView recyclerView;
    private HomeAdapter adapter;

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_home;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
             setupRecyclerView(view);

    }
    private Corses readJsonData(){
        String json =  Util.loadJSONFromAsset(getContext(), "courses.json");
        return (Corses) Util.parseDeta(json);
    }
    private void setupRecyclerView(View view){
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter = new HomeAdapter());
        Corses corses = readJsonData();
        adapter.updeta(corses.getResults());
    }

}
