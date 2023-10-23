package org.lld.casestudies.hotelmanagement;

import java.util.List;

public class Room {
    private String roomNumber;
    private RoomStyle roomStyle;
    private RoomStatus roomStatus;
    private Double bookingPrice;
    List<RoomKey> roomKeys;
    List<HouseKeepingLogs> houseKeepingLogs;
}
