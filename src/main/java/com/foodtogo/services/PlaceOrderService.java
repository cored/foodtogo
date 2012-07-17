package com.foodtogo.services;

import com.foodtogo.repositories.RestaurantRepository;
import com.foodtogo.values.Address;

import java.util.Date;

public interface PlaceOrderService {
    PlaceOrderServiceResult updateDeliveryInfo(RestaurantRepository restaurantRepository, String pendingOrderId, Address deliveryAddress, Date deliveryTime);

}
