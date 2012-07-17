package com.foodtogo.repositories;

import com.foodtogo.entities.PendingOrder;

public interface PendingOrderRepository {
    PendingOrder findOrCreatePendingOrder(String pendingOrderId);
}
