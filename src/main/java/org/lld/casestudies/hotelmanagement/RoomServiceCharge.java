package org.lld.casestudies.hotelmanagement;

public class RoomServiceCharge implements BaseRoomCharge {
    private double cost;
    BaseRoomCharge baseRoomCharge;
    @Override
    public Double getCost() {
        baseRoomCharge.setCost(baseRoomCharge.getCost() + cost);
        return baseRoomCharge.getCost();
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }
}
