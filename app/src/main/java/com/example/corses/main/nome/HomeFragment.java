package com.example.corses.main.nome;


import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.corses.R;
import com.example.corses.Util.Util;
import com.example.corses.base.BeseFragment;
import com.example.corses.model.Corses;

public class HomeFragment extends BeseFragment {

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_home;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
            readJsonData();

    }
    private void readJsonData(){
        String json =  Util.loadJSONFromAsset(getContext(), "");
        Corses corses =  Util.parseDeta(json);
    }

}
