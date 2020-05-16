package com.fajar.latihan.queenphonestore.product.google;

import com.fajar.latihan.queenphonestore.R;
import com.fajar.latihan.queenphonestore.product.HandPhone;

import java.util.ArrayList;

public class Google_Phone {
    private static String[] googlePhone = {
            "Google Pixel 3 XL",
            "Google Pixel 3a XL",
            "Google Pixel 4",
            "Google Pixel 4 XL",
    };

    private static String[] googlePrice = {
            "Rp. 6.599.000",
            "Rp. 5.499.000",
            "Rp. 9.199.000",
            "Rp. 10.599.000",
    };

    private static int[] googlePhoto = {
            R.drawable.pixel_3_xl_5,
            R.drawable.pixel_3axl,
            R.drawable.pixel_4,
            R.drawable.pixel_4xl,
    };

    public static ArrayList<HandPhone> getGooglePhoneList() {
        ArrayList<HandPhone> phones = new ArrayList<>();
        for (int position = 0; position < googlePhone.length; position++) {
            HandPhone handPhone = new HandPhone();
            handPhone.setBrand(googlePhone[position]);
            handPhone.setPrice(googlePrice[position]);
            handPhone.setPhoto(googlePhoto[position]);
            phones.add(handPhone);
        }
        return phones;
    }
}
