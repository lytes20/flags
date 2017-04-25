package com.lytestech.flags;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView myGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myGrid = (GridView) findViewById(R.id.gridView);
    }
}

class Country{
    int imageId;
    String countryName;

    public Country(int imageId, String countryName) {
        this.countryName = countryName;
        this.imageId = imageId;
    }
}

class ViewHolder{
    ImageView myCountry;

    public ViewHolder(View v) {
        myCountry = (ImageView) v.findViewById(R.id.imageView);
    }
}

class GidzHelper extends BaseAdapter{

    ArrayList<Country> list;

    public GidzHelper(Context context) {
        list = new ArrayList<Country>();
        Resources res = context.getResources();
        String [] Names  = res.getStringArray(R.array.country_names);
        int [] countryFlags = {R.drawable.japan, R.drawable.kyrgyzstan, R.drawable.uganda, R.drawable.united_kingdom, R.drawable.united_states};

        for(int i=0; i<5; i++){
            Country tempCountry = new Country(countryFlags[i], Names[i]);
            list.add(tempCountry);
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



        return null;
    }
}