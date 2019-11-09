package com.moussa889.ui.fragments;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.moussa889.mycar.R;


public class AppointmentCalander extends Fragment  {

    Button btnAddSeance;
    View form;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //just change the fragment_dashboard
        //with the fragment you want to inflate
        //like if the class is HomeFragment it should have R.layout.home_fragment
        //if it is DashboardFragment it should have R.layout.fragment_dashboard
        form= inflater.inflate(R.layout.ajouterseancecandidat,container,false);


        return inflater.inflate(R.layout.appointmentcalander
                , null);
    }


}
