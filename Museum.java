package com.example.museumsnyc;

import java.io.Serializable;

public abstract class Museum implements Serializable {
    static final int MAX_TICKETS = 5;
//    protected int studentTickets;
//    protected int adultTickets;
//    protected int seniorTickets;
//
//    public Museum(int studentTickets, int adultTickets, int seniorTickets){
//        this.studentTickets = studentTickets;
//        this.adultTickets = adultTickets;
//        this.seniorTickets = seniorTickets;
//    }
//
//    public abstract double totalTicketPrice();
//    public abstract double totalPrice();
//
//    public boolean addStudentTicket(int tickets){
//        if(studentTickets + tickets <= MAX_TICKETS){
//            studentTickets += tickets;
//            return true;
//        }
//        return false;
//    }
//
//    public boolean subtractStudentTicket(int tickets){
//        if(studentTickets - tickets >= 0){
//            studentTickets -= tickets;
//            return true;
//        }
//        return false;
//    }
//
//    public boolean addAdultTicket(int tickets){
//        if(adultTickets + tickets <= MAX_TICKETS){
//            adultTickets += tickets;
//            return true;
//        }
//        return false;
//    }
//
//    public boolean subtractAdultTicket(int tickets){
//        if(adultTickets - tickets >= 0){
//            adultTickets -= tickets;
//            return true;
//        }
//        return false;
//    }
//
//    public boolean addSeniorTicket(int tickets){
//        if(seniorTickets + tickets <= MAX_TICKETS){
//            seniorTickets += tickets;
//            return true;
//        }
//        return false;
//    }
//
//    public boolean subtractSeniorTicket(int tickets){
//        if(seniorTickets - tickets >= 0){
//            seniorTickets -= tickets;
//            return true;
//        }
//        return false;
//    }
}
