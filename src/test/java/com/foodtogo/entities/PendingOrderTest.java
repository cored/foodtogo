package com.foodtogo.entities;


import com.foodtogo.values.Address;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class PendingOrderTest {
    private Date goodDeliveryTime;
    private Address goodDeliveryAddress;
    private PendingOrder pendingOrder;

    @Before
    protected void setUp() {
        pendingOrder = new PendingOrder();
        goodDeliveryAddress = RestaurantTestData.ADDRESS1;
        goodDeliveryTime = RestaurantTestData.makeGoodDeliveryTime();
    }

    @Test
    public void testUpdateDeliveryInfo_good() {
        boolean result = pendingOrder.updateDeliveryInfo(goodDeliveryAddress, goodDeliveryTime);

        assertTrue(result);
        assertSame(goodDeliveryAddress, pendingOrder.getDeliveryAddress());
        assertSame(goodDeliveryTime, pendingOrder.getDeliveryTime());
    }


}
