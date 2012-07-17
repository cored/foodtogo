package com.foodtogo.services;

import com.foodtogo.entities.PendingOrder;
import com.foodtogo.repositories.PendingOrderRepository;
import com.foodtogo.values.Address;

import java.util.Date;

public class PlaceOrderServiceImpl implements PlaceOrderService {

    private PendingOrderRepository pendingOrderRepository;

    public PlaceOrderServiceImpl(PendingOrderRepository pendingOrderRepository) {
        this.pendingOrderRepository = pendingOrderRepository;
    }

    @Override
    public PlaceOrderServiceResult updateDeliveryInfo(String pendingOrderId, Address deliveryAddress, Date deliveryTime) {
        PendingOrder pendingOrder = pendingOrderRepository.findOrCreatePendingOrder(pendingOrderId);
        boolean success = pendingOrder.updateDeliveryInfo(deliveryAddress, deliveryTime);

        return new PlaceOrderServiceResult(success, pendingOrder);
    }


}
