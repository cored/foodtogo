package com.foodtogo.repositories;

import com.foodtogo.values.Address;

import java.util.Date;

public interface RestaurantRepository {
    boolean isRestaurantAvailable(Address deliveryAddress, Date deliveryTime);
}
