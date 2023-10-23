package org.lld.casestudies.hotelmanagement;

import java.util.Date;
import java.util.List;

public class RoomBooking {
    String bookingId;
    Date startDate;
    int durationInDays;
    BookingStatus bookingStatus;
    List<Guest> guestList;
    List<Room> roomInfo;
    BaseRoomCharge totalRoomCharge;

}
