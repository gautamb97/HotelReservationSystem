package com.hotelreservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
    @Test
    public void givenHotelIsAddedToHotelReservationSystemShouldReturnTrue(){
        HotelReservationSystem list = new HotelReservationSystem();
        boolean hotelList = list.addingHotel();
        Assert.assertTrue(hotelList);
    }
}
