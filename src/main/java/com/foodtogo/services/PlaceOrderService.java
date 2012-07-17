package com.foodtogo.services;

import com.foodtogo.values.Address;

import java.util.Date;

public interface PlaceOrderService {
    PlaceOrderServiceResult updateDeliveryInfo(String pendingOrderId, Address deliveryAddress, Date deliveryTime);

}
