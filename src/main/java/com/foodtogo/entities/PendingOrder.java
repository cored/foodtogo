package com.foodtogo.entities;

import com.foodtogo.repositories.RestaurantRepository;
import com.foodtogo.values.Address;

import java.util.Calendar;
import java.util.Date;

public class PendingOrder {
    private Address deliveryAddress;
    private Date deliveryTime;

    public PendingOrder() {
        this.deliveryAddress = new Address();
        this.deliveryTime = new Date();
    }

    public boolean updateDeliveryInfo(RestaurantRepository restaurantRepository, Address deliveryAddress, Date deliveryTime) {
        Calendar earliestDeliveryTime = Calendar.getInstance();
        earliestDeliveryTime.add(Calendar.HOUR, 1);
        if (deliveryTime.before(earliestDeliveryTime.getTime()))
            return false;

        if (restaurantRepository.isRestaurantAvailable(deliveryAddress, deliveryTime)) {
            this.deliveryTime = deliveryTime;
            this.deliveryAddress = deliveryAddress;
            return true;
        } else {
            return false;
        }
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }
}
