package com.foodtogo.entities;


import com.foodtogo.repositories.RestaurantRepository;
import com.foodtogo.values.Address;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static junit.framework.Assert.assertSame;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PendingOrderTest {
    private Date goodDeliveryTime;
    private Address goodDeliveryAddress;
    private PendingOrder pendingOrder;
    private RestaurantRepository mockRestaurantRepository;
    private RestaurantRepository restaurantRepository;


    @Before
    public void setUp() {
        pendingOrder = new PendingOrder();
        goodDeliveryAddress = RestaurantTestData.getADDRESS1();
        goodDeliveryTime = RestaurantTestData.makeGoodDeliveryTime();

        mockRestaurantRepository = mock(RestaurantRepository.class);
        restaurantRepository = mockRestaurantRepository;
    }

    @Test
    public void testUpdateDeliveryInfo_good() {
        when(mockRestaurantRepository.isRestaurantAvailable(goodDeliveryAddress, goodDeliveryTime)).thenReturn(true);
        boolean result = pendingOrder.updateDeliveryInfo(restaurantRepository, goodDeliveryAddress, goodDeliveryTime);

        assertTrue(result);
        assertSame(goodDeliveryAddress, pendingOrder.getDeliveryAddress());
        assertSame(goodDeliveryTime, pendingOrder.getDeliveryTime());
    }


}
