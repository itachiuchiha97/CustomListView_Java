package com.maineybnaya.customlistview_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*... Add random names insterion function for a very long list*/

    TextView tvD1;
    TextView tvD2;
    TextView tvTeam;

    String[] teams = {"Ferrari", "Redbull", "Mercedes", "Torro Rosso", "Mclaren", "Sauber", "Williams"};
    String[] drivers = {"Vettel", "Alonso", "Raikonnen", "Hamilton", "Sainz", "Bottas", "Grosjean", "Leclerc", "Norris", "Vandoorne", "Ricciardo", "Verstappen"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvItems = findViewById(R.id.lvItems);

        ma_CustomAdapter mv_customAdapter = new ma_CustomAdapter();

        lvItems.setAdapter(mv_customAdapter);

    }

    class ma_CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return teams.length-1;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            convertView = getLayoutInflater().inflate(R.layout.customlayout, null);

            TextView tvD1 = convertView.findViewById(R.id.tvD1);
            TextView tvD2 = convertView.findViewById(R.id.tvD2);
            TextView tvTeam = convertView.findViewById(R.id.tvTeam);

            tvD1.setText(drivers[position]);
            tvD2.setText(drivers[position]);

            tvTeam.setText(teams[position]);

            return convertView;
        }
    }
}
