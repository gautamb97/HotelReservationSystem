package com.hotelreservation;


public class Hotels {
    String hotelName;
    int rate;

    public Hotels(String hotelName, int rate) {
        this.hotelName = hotelName;
        this.rate = rate;
    }
    public String toString(){
        return "Hotel Name: "+hotelName+ ", Rate of the Hotel: "+rate;
    }
}
