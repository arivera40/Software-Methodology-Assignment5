package com.example.museumsnyc;

import androidx.appcompat.app.AppCompatActivity;

/**
* This is the class for PriceDetailsActivity which extends AppCompatActivity
* that defines all of the messages to be shown on certain actions
*
*
* @author Andy Rivera and Joseph Shamma
*
*/

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class PriceDetailsActivity extends AppCompatActivity {
    private Double studentTicketPrice;
    private Double adultTicketPrice;
    private Double seniorTicketPrice;

    private Double ticketCost;
    private Double taxCost;
    private Double totalCost;

    private int studentTicketQuantity;
    private int adultTicketQuantity;
    private int seniorTicketQuantity;

    private TextView studentPrice;
    private TextView adultPrice;
    private TextView seniorPrice;
    private TextView studentQuantity;
    private TextView adultQuantity;
    private TextView seniorQuantity;
    private TextView ticketPrice;
    private TextView taxPrice;
    private TextView totalPrice;
    private ImageButton museumButton;

    private String pattern = "0.00";
    private String urlPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_details);
        Toast.makeText(this, "Maximum of 5 tickets for each!", Toast.LENGTH_LONG).show();

        //Initializing Text and Edit Views for easy modification upon change
        studentPrice = (TextView)findViewById(R.id.studentPrice);
        adultPrice = (TextView)findViewById(R.id.adultPrice);
        seniorPrice = (TextView)findViewById(R.id.seniorPrice);
        studentQuantity = (TextView)findViewById(R.id.studentQuantity);
        adultQuantity = (TextView)findViewById(R.id.adultQuantity);
        seniorQuantity = (TextView)findViewById(R.id.seniorQuantity);
        ticketPrice = (TextView)findViewById(R.id.ticketPrice);
        taxPrice = (TextView)findViewById(R.id.taxPrice);
        totalPrice = (TextView)findViewById(R.id.totalPrice);
        museumButton = (ImageButton)findViewById((R.id.museumImageButton));

        //Retrieves bundled data on museum from previous Activity
        Intent i = this.getIntent();
        Bundle bundle = i.getExtras();
        Museum museum = (Museum)bundle.getSerializable("museum");

        //Evaluates which Museum subclass was passed to load ticketPrices
        if(museum instanceof AmericanArt){
            ((TextView)findViewById(R.id.museumTitle)).setText("Whitney Museum of American Art");
            urlPath = "https://whitney.org/";
            museumButton.setBackgroundResource(R.drawable.american_art);
            AmericanArt americanArt = (AmericanArt) museum;
            studentTicketPrice = americanArt.studentTicketPrice;
            adultTicketPrice = americanArt.adultTicketPrice;
            seniorTicketPrice = americanArt.seniorTicketPrice;
        }else if(museum instanceof ArtsAndDesign){
            ((TextView)findViewById(R.id.museumTitle)).setText("Museum of Arts and Design");
            urlPath = "https://madmuseum.org/";
            museumButton.setBackgroundResource(R.drawable.arts_and_design);
            ArtsAndDesign artsDesign = (ArtsAndDesign) museum;
            studentTicketPrice = artsDesign.studentTicketPrice;
            adultTicketPrice = artsDesign.adultTicketPrice;
            seniorTicketPrice = artsDesign.seniorTicketPrice;
        }else if(museum instanceof ModernArt){
            ((TextView)findViewById(R.id.museumTitle)).setText("The Museum of Modern Art");
            urlPath = "https://www.moma.org/";
            museumButton.setBackgroundResource(R.drawable.modern_art);
            ModernArt modernArt = (ModernArt) museum;
            studentTicketPrice = modernArt.studentTicketPrice;
            adultTicketPrice = modernArt.adultTicketPrice;
            seniorTicketPrice = modernArt.seniorTicketPrice;
        }else{
            ((TextView)findViewById(R.id.museumTitle)).setText("American Museum of Natural Science");
            urlPath = "https://www.amnh.org/";
            museumButton.setBackgroundResource(R.drawable.natural_history);
            NaturalHistory naturalHistory = (NaturalHistory) museum;
            studentTicketPrice = naturalHistory.studentTicketPrice;
            adultTicketPrice = naturalHistory.adultTicketPrice;
            seniorTicketPrice = naturalHistory.seniorTicketPrice;
        }
        //int values associated with the studentQuantity, adultQuantity, seniorQuantity EditText's
        studentTicketQuantity = 0;
        adultTicketQuantity = 0;
        seniorTicketQuantity = 0;

        //Double values associated with ticketPrice, taxPrice, totalPrice TextView's
        ticketCost = 0.00;
        taxCost = 0.00;
        totalCost = 0.00;

        //Set default values for TextViews
        studentPrice.setText("$" + formatPrice(studentTicketPrice));
        adultPrice.setText("$" + formatPrice(adultTicketPrice));
        seniorPrice.setText("$" + formatPrice(seniorTicketPrice));

        studentQuantity.setText("x0");
        adultQuantity.setText("x0");
        seniorQuantity.setText("x0");

        ticketPrice.setText("$0.00");
        taxPrice.setText("$0.00");
        totalPrice.setText("$0.00");
    }
    /*
     * Formats the price
     */
    private String formatPrice(double price){
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String numberStr = decimalFormat.format(price);
        return numberStr;
    }
    /*
     * Increases the ticket quality of students
     */
    public void increaseStudentQuantity(View v){
        //Over the limit of 5 tickets
        if(!(studentTicketQuantity + 1 <= 5)){
            Toast.makeText(this, "Maximum of 5 tickets for each!", Toast.LENGTH_LONG).show();
            return;
        }
        studentTicketQuantity++;
        studentQuantity.setText("x" + studentTicketQuantity);
        updatePrices();
        return;
    }
    /*
     * Decreases the ticket quality of students
     */
    public void decreaseStudentQuantity(View v){
        //Can't have less than 0 tickets
        if(!(studentTicketQuantity - 1 >= 0)){
            Toast.makeText(this, "Cannot have less than 0 tickets!", Toast.LENGTH_LONG).show();
            return;
        }
        studentTicketQuantity--;
        studentQuantity.setText("x" + studentTicketQuantity);
        updatePrices();
        return;
    }
    /*
     * Increases the ticket quality of adults
     */
    public void increaseAdultQuantity(View v){
        //Over the limit of 5 tickets
        if(!(adultTicketQuantity + 1 <= 5)){
            Toast.makeText(this, "Maximum of 5 tickets for each!", Toast.LENGTH_LONG).show();
            return;
        }
        adultTicketQuantity++;
        adultQuantity.setText("x" + adultTicketQuantity);
        updatePrices();
        return;
    }
    /*
     * Decreases the ticket quality of adults
     */
    public void decreaseAdultQuantity(View v){
        //Can't have less than 0 tickets
        if(!(adultTicketQuantity - 1 >= 0)){
            Toast.makeText(this, "Cannot have less than 0 tickets!", Toast.LENGTH_LONG).show();
            return;
        }
        adultTicketQuantity--;
        adultQuantity.setText("x" + adultTicketQuantity);
        updatePrices();
        return;
    }
    /*
     * Increases the ticket quality of seniors
     */
    public void increaseSeniorQuantity(View v){
        //Over the limit of 5 tickets
        if(!(seniorTicketQuantity + 1 <= 5)){
            Toast.makeText(this, "Maximum of 5 tickets for each!", Toast.LENGTH_LONG).show();
            return;
        }
        seniorTicketQuantity++;
        seniorQuantity.setText("x" + seniorTicketQuantity);
        updatePrices();
        return;
    }
    /*
     * Decreases the ticket quality of seniors
     */
    public void decreaseSeniorQuantity(View v){
        //Can't have less than 0 tickets
        if(!(seniorTicketQuantity - 1 >= 0)){
            Toast.makeText(this, "Cannot have less than 0 tickets!", Toast.LENGTH_LONG).show();
            return;
        }
        seniorTicketQuantity--;
        seniorQuantity.setText("x" + seniorTicketQuantity);
        updatePrices();
        return;
    }
    /*
     * updates the total price
     */
    private void updatePrices(){
        ticketCost = (studentTicketQuantity * studentTicketPrice) + (adultTicketQuantity * adultTicketPrice) + (seniorTicketQuantity * seniorTicketPrice);
        taxCost = ticketCost * 0.08875;
        totalCost = ticketCost + taxCost;

        ticketPrice.setText("$" + formatPrice(ticketCost));
        taxPrice.setText("$" + formatPrice(taxCost));
        totalPrice.setText("$" + formatPrice(totalCost));
    }

    public void launchBrowserActivity(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlPath));
        startActivity(browserIntent);
    }
}
