package com.foodtogo.services;

import com.foodtogo.entities.PendingOrder;

public class PlaceOrderServiceResult {
    private boolean success;
    private PendingOrder pendingOrder;

    public PlaceOrderServiceResult(boolean success, PendingOrder pendingOrder) {
        this.success = success;
        this.pendingOrder = pendingOrder;
    }

    public boolean isSuccess() {
        return success;
    }

    public PendingOrder getPendingOrder() {
        return pendingOrder;
    }
}
