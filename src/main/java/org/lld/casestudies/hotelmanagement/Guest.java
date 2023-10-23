package org.lld.casestudies.hotelmanagement;

import java.util.ArrayList;
import java.util.List;

public class Guest extends Person {
    private Search searchObj;
    private Booking bookingObj;

    public List<RoomBooking> getAllRoomBookings() {
        return new ArrayList<>();
    }
}
