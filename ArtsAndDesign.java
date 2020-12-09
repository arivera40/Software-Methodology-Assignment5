package com.example.museumsnyc;

import java.io.Serializable;

/**
* This is the class for ArtsAndDesign which extends Museum and implments Serializable,
* that defines student, adult, and senior ticket price
*
*
* @author Andy Rivera and Joseph Shamma
*
*/


public class ArtsAndDesign extends Museum implements Serializable {

    static final double studentTicketPrice = 18.00;  // price of student ticket
    static final double adultTicketPrice = 23.00;   // price of adult ticket
    static final double seniorTicketPrice = 18.00;  // price of senior ticket
    
}
