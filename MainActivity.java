package com.example.museumsnyc;

import androidx.appcompat.app.AppCompatActivity;

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

        museumListView = (ListView)findViewById(R.id.museumListView);

        ArrayList<String> museumList = new ArrayList<String>();
        museumList.add("Whitney Museum of American Art");
        museumList.add("Museum of Modern Art");
        museumList.add("Museum of Arts and Design");
        museumList.add("Museum of Natural History");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, museumList);

        museumListView.setAdapter(adapter);

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

    public void launchAmericanArt(View v){
        AmericanArt museum = new AmericanArt();
        Intent i = new Intent(this, PriceDetailsActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("museum", museum);
        i.putExtras(bundle);

        startActivity(i);
    }

    public void launchArtsAndDesign(View v){
        ArtsAndDesign museum = new ArtsAndDesign();
        Intent i = new Intent(this, PriceDetailsActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("museum", museum);
        i.putExtras(bundle);

        startActivity(i);
    }

    public void launchModernArt(View v){
        ModernArt museum = new ModernArt();
        Intent i = new Intent(this, PriceDetailsActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("museum", museum);
        i.putExtras(bundle);

        startActivity(i);
    }

    public void launchNaturalHistory(View v){
        NaturalHistory museum = new NaturalHistory();
        Intent i = new Intent(this, PriceDetailsActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("museum", museum);
        i.putExtras(bundle);

        startActivity(i);
    }
}
