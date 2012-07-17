package com.foodtogo.entities;

import com.foodtogo.values.Address;

import java.util.Date;

public class PendingOrder {
    private Address deliveryAddress;
    private Date deliveryTime;

    public PendingOrder() {
        this.deliveryAddress = new Address();
        this.deliveryTime = new Date();
    }

    public boolean updateDeliveryInfo(Address deliveryAddress, Date deliveryTime) {
        return false;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }
}
