package com.fajar.latihan.queenphonestore.product.iphone;

import com.fajar.latihan.queenphonestore.R;
import com.fajar.latihan.queenphonestore.product.HandPhone;

import java.util.ArrayList;

public class Iphone_Phone {
    private static String[] iphonePhone = {
            "iPhone 11 Pro max",
            "iPhone 11 Pro",
            "iPhone 11",
            "iPhone SE 2020",
            "iPhone Xs Max",
            "iPhone Xs",
            "iPhone Xr",
            "iPad Pro 2020",
    };

    private static String[] iphonePrice = {
            "Rp. 34.599.000",
            "Rp. 24.499.000",
            "Rp. 19.199.000",
            "Rp. 8.999.000",
            "Rp. 16.199.000",
            "Rp. 13.299.000",
            "Rp. 9.999.000",
            "Rp. 11.399.000",

    };

    private static int[] iphonePhoto = {
            R.drawable.iphone_11_pro_max,
            R.drawable.iphone_11pro,
            R.drawable.iphone_11_2,
            R.drawable.iphone_se2020,
            R.drawable.iphone_xs_max_black2,
            R.drawable.iphone_xs,
            R.drawable.iphone_xr,
            R.drawable.ipad_pro2020,
    };

    public static ArrayList<HandPhone> getIphonePhoneList() {
        ArrayList<HandPhone> phones = new ArrayList<>();
        for (int position = 0; position < iphonePhone.length; position++) {
            HandPhone handPhone = new HandPhone();
            handPhone.setBrand(iphonePhone[position]);
            handPhone.setPrice(iphonePrice[position]);
            handPhone.setPhoto(iphonePhoto[position]);
            phones.add(handPhone);
        }
        return phones;
    }
}
