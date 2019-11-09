package com.moussa889.mycar;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.moussa889.ui.actitivity.ListCandidat;
import com.moussa889.ui.dialog.PopAjouterSeanceCandidat;
import com.moussa889.ui.fragments.AppointmentCalander;
import com.moussa889.ui.fragments.DashboardFragment;
import com.moussa889.ui.fragments.Notification;


public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragment = new AppointmentCalander();
                    break;
                case R.id.navigation_dashboard:

//                    FragmentManager manager = getSupportFragmentManager();
//                    Dashboard dashboard=new Dashboard();
//                    dashboard.show(manager,null);
                    fragment = new DashboardFragment();
                    break;
                case R.id.navigation_notifications:
                    fragment = new Notification();
                    break;
            }
            return loadFragment(fragment);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new AppointmentCalander());

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;

    }

    public void ajouter(View view) {
        FragmentManager manager = getSupportFragmentManager();
        PopAjouterSeanceCandidat popajouterseance=new PopAjouterSeanceCandidat();
        popajouterseance.show(manager,null);
    }

    public void AfficherListCandidat(View view) {

        Intent intent=new Intent(this, ListCandidat.class);
        startActivity(intent);
    }
}