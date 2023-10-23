package org.lld.casestudies.hotelmanagement;

/*
    Decorator pattern is used to add upon the base room price.
 */
public interface BaseRoomCharge {
    Double getCost();
    void setCost(double cost);
}
