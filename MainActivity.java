package com.example.museumsnyc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
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