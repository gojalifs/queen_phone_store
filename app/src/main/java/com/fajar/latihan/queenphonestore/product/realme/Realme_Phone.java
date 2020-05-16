package com.fajar.latihan.queenphonestore.product.realme;

import com.fajar.latihan.queenphonestore.R;
import com.fajar.latihan.queenphonestore.product.HandPhone;

import java.util.ArrayList;

public class Realme_Phone {
    private static String[] realmePhone = {
            "Realme X2 Pro",
            "Realme 6 Pro",

    };

    private static String[] realmePrice = {
            "Rp. 7.599.000",
            "Rp. 5.499.000",

    };

    private static int[] realmePhoto = {
            R.drawable.realme_x2pro,
            R.drawable.realme_6pro,

    };

    public static ArrayList<HandPhone> getRealmePhoneList() {
        ArrayList<HandPhone> phones = new ArrayList<>();
        for (int position = 0; position < realmePhone.length; position++) {
            HandPhone handPhone = new HandPhone();
            handPhone.setBrand(realmePhone[position]);
            handPhone.setPrice(realmePrice[position]);
            handPhone.setPhoto(realmePhoto[position]);
            phones.add(handPhone);
        }
        return phones;
    }
}
