package com.fajar.latihan.queenphonestore.product.xiaomi;

import com.fajar.latihan.queenphonestore.R;
import com.fajar.latihan.queenphonestore.product.HandPhone;

import java.util.ArrayList;

public class Xiaomi_Phone {
    private static String[] xiaomiPhone = {
            "Xiaomi Mi 10"
    };

    private static String[] xiaomiPrice = {
            "Rp. 11.099.000"
    };

    private static int[] xiaomiPhoto = {
            R.drawable.xiaomi_mi_10,
    };

    public static ArrayList<HandPhone> getHuaweiPhoneList() {
        ArrayList<HandPhone> phones = new ArrayList<>();
        for (int position = 0; position < xiaomiPhone.length; position++) {
            HandPhone handPhone = new HandPhone();
            handPhone.setBrand(xiaomiPhone[position]);
            handPhone.setPrice(xiaomiPrice[position]);
            handPhone.setPhoto(xiaomiPhoto[position]);
            phones.add(handPhone);
        }
        return phones;
    }
}
