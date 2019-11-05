package com.moussa889.mycar;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Dashboard extends DialogFragment implements View.OnClickListener {

    View form;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        form= inflater.inflate(R.layout.dashboard,container,false);
        return form;

    }

    @Override
    public void onClick(View v) {

    }

}
