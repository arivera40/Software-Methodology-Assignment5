package com.example.museumsnyc;

import java.io.Serializable;

public class AmericanArt extends Museum implements Serializable {

    static final double studentTicketPrice = 18.00;
    static final double adultTicketPrice = 25.00;
    static final double seniorTicketPrice = 18.00;

//    public AmericanArt(int studentTickets, int adultTickets, int seniorTickets){
//        super(studentTickets, adultTickets, seniorTickets);
//    }
//
//    //Calculates and returns price of selected tickets
//    public double totalTicketPrice(){
//        return (studentTicketPrice * studentTickets) + (adultTicketPrice * adultTickets) + (seniorTicketPrice * seniorTickets);
//    }
//
//    //Calculates and returns price of selected tickets (Tax Included)
//    public double totalPrice(){
//        double studentPrice = studentTicketPrice * studentTickets;
//        double adultPrice = adultTicketPrice * adultTickets;
//        double seniorPrice = seniorTicketPrice * seniorTickets;
//        double tax = calculateTax(studentPrice, adultPrice, seniorPrice);
//        return studentPrice + adultPrice + seniorPrice + tax;
//    }
//
//    //Calculates NYC tax
//    public double calculateTax(double studentPrice, double adultPrice, double seniorPrice){
//        return (studentPrice + adultPrice + seniorPrice) * 0.08875;
//    }
//
//    public boolean addStudentTicket(int tickets){
//        return super.addStudentTicket(tickets);
//    }
//
//    public boolean subtractStudentTicket(int tickets){
//        return super.subtractStudentTicket(tickets);
//    }
//
//    public boolean addAdultTicket(int tickets){
//        return super.addAdultTicket(tickets);
//    }
//
//    public boolean subtractAdultTicket(int tickets){
//        return super.subtractAdultTicket(tickets);
//    }
//
//    public boolean addSeniorTicket(int tickets){
//        return super.addSeniorTicket(tickets);
//    }
//
//    public boolean subtractSeniorTicket(int tickets){
//        return super.subtractSeniorTicket(tickets);
//    }
}
