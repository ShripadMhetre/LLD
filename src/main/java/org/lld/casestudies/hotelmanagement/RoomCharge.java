package org.lld.casestudies.hotelmanagement;

public class RoomCharge implements BaseRoomCharge{
    private double cost;
    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }
}
