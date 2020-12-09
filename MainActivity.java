package com.example.museumsnyc;

import androidx.appcompat.app.AppCompatActivity;

/**
* This is the class for MainActivity which extends AppCompatActivity,
* it creates all the different museums.
*
*
* @author Andy Rivera and Joseph Shamma
*
*/


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView museumListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
        // list view to show the list of the museums
        museumListView = (ListView)findViewById(R.id.museumListView);

        ArrayList<String> museumList = new ArrayList<String>();
        museumList.add("Whitney Museum of American Art");
        museumList.add("Museum of Modern Art");
        museumList.add("Museum of Arts and Design");
        museumList.add("Museum of Natural History");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, museumList);

        museumListView.setAdapter(adapter);
        // on item click listen to see if something was clicked (which museum)
        museumListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long l){
                if(i == 0){
                    launchAmericanArt(v);
                }else if(i == 1){
                    launchArtsAndDesign(v);
                }else if(i == 2){
                    launchModernArt(v);
                }else{
                    launchNaturalHistory(v);
                }
            }
        });
    }
    /*
     * launching the American Art Museum
     */
    public void launchAmericanArt(View v){
        AmericanArt museum = new AmericanArt();
        Intent i = new Intent(this, PriceDetailsActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("museum", museum);
        i.putExtras(bundle);

        startActivity(i);
    }
    /*
     * launching the Arts and Design Art Museum
     */
    public void launchArtsAndDesign(View v){
        ArtsAndDesign museum = new ArtsAndDesign();
        Intent i = new Intent(this, PriceDetailsActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("museum", museum);
        i.putExtras(bundle);

        startActivity(i);
    }
    /*
     * launching the Modern Art Museum
     */
    public void launchModernArt(View v){
        ModernArt museum = new ModernArt();
        Intent i = new Intent(this, PriceDetailsActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("museum", museum);
        i.putExtras(bundle);

        startActivity(i);
    }
    /*
     * launching the Natural History Art Museum
     */
    public void launchNaturalHistory(View v){
        NaturalHistory museum = new NaturalHistory();
        Intent i = new Intent(this, PriceDetailsActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("museum", museum);
        i.putExtras(bundle);

        startActivity(i);
    }
}
