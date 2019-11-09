package com.moussa889.ui.actitivity;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.moussa889.Adapters.AdapterItems;

import com.moussa889.mycar.R;

import java.util.ArrayList;

public class ListCandidat extends AppCompatActivity {
    ArrayList<AdapterItems> listnewsData = new ArrayList<AdapterItems>();
    MyCustomAdapter myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_candidat);

        listnewsData.add(new AdapterItems(1,"riadh","moussa","88888888","12345678","mahdia","c"));
        myadapter=new MyCustomAdapter(listnewsData);
        ListView lsNews=(ListView)findViewById(R.id.list_candidat);
        lsNews.setAdapter(myadapter);//intisal with data
    }


    private class MyCustomAdapter extends BaseAdapter {
        public ArrayList<AdapterItems> listnewsDataAdpater ;

        public MyCustomAdapter(ArrayList<AdapterItems>  listnewsDataAdpater) {
            this.listnewsDataAdpater=listnewsDataAdpater;
        }


        @Override
        public int getCount() {
            return listnewsDataAdpater.size();
        }

        @Override
        public String getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater mInflater = getLayoutInflater();
            View myView = mInflater.inflate(R.layout.single_row_condidat, null);

            final   AdapterItems s = listnewsDataAdpater.get(position);

            TextView txtJobTitle=(TextView)myView.findViewById(R.id.tv_user_name);
            txtJobTitle.setText(s.FirstName+" "+s.LastName);

            myView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), ProfileCandidat.class);
                    startActivity(intent);
                }
            });
            return myView;
        }

    }
}
