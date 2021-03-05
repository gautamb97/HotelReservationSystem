package com.hotelreservation;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {

    public boolean addingHotel() {
        List<Hotels> hotelsList = new ArrayList<>();
        Hotels hotel1 = new Hotels("LakeWood",110);
        hotelsList.add(hotel1);
        Hotels hotel2 = new Hotels("BridgeWood",110);
        hotelsList.add(hotel2);
        Hotels hotel3 = new Hotels("RidgeWood",110);
        System.out.println(hotelsList.add(hotel3));
        return true;
    }
}
