package org.lld.casestudies.hotelmanagement;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Hotel {
    private int id;
    private String name;
    private Location hotelLocation;
    private List<Room> roomList;

}
