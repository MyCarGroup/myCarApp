package com.moussa889.ui.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.moussa889.mycar.R;

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
