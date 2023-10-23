package org.lld.casestudies.hotelmanagement;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Location {
    private int pin;
    private String street;
    private String area;
    private String city;
    private String country;
}
