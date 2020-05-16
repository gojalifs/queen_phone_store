package com.fajar.latihan.queenphonestore.product.samsung;

import com.fajar.latihan.queenphonestore.R;
import com.fajar.latihan.queenphonestore.product.HandPhone;

import java.util.ArrayList;

public class Samsung_Phone {
    private static String[] samsungPhone = {
            "Samsung S20 Ultra",
            "Samsung Note 10 Plus",

    };

    private static String[] samsungPrice = {
            "Rp. 14.599.000",
            "Rp. 14.499.000",

    };

    private static int[] samsungPhoto = {
            R.drawable.samsung_s20ultra,
            R.drawable.samsung_note10plus,

    };

    public static ArrayList<HandPhone> getSamsungPhoneList() {
        ArrayList<HandPhone> phones = new ArrayList<>();
        for (int position = 0; position < samsungPhone.length; position++) {
            HandPhone handPhone = new HandPhone();
            handPhone.setBrand(samsungPhone[position]);
            handPhone.setPrice(samsungPrice[position]);
            handPhone.setPhoto(samsungPhoto[position]);
            phones.add(handPhone);
        }
        return phones;
    }
}
