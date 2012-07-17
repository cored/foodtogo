package com.foodtogo.entities;

import com.foodtogo.values.Address;

import java.util.Calendar;
import java.util.Date;

public class RestaurantTestData {
    public static String ZIP1 = "94619";

    public static Date makeGoodDeliveryTime() {
        return getTimeTomorrow(20);
    }

    public static Date getTimeTomorrow(int hour) {
        return getTimeTomorrow(hour, 0);
    }

    public static Date getTimeTomorrow(int hour, int minute) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, 1);
        if (c.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY)
            c.add(Calendar.DAY_OF_MONTH, 1);
        c.set(Calendar.HOUR_OF_DAY, hour);
        c.set(Calendar.MINUTE, minute);
        c.clear(Calendar.MILLISECOND);
        Date during = c.getTime();
        return during;
    }


    public static Address getADDRESS1() {
        return new Address("1 somewhere", null, "Oakland", "CA",
                ZIP1);
    }

}
