package com.fajar.latihan.queenphonestore.product.honor;

import com.fajar.latihan.queenphonestore.R;
import com.fajar.latihan.queenphonestore.product.HandPhone;

import java.util.ArrayList;

public class Honor_Phone {
    private static String[] honorPhone = {
            "Honor 30 Pro Plus",
            "Honor 30 Pro",
            "Honor 30",
    };

    private static String[] honorPrice = {
            "Rp. 10.599.000",
            "Rp. 8.499.000",
            "Rp. 6.199.000",
    };

    private static int[] honorPhoto = {
            R.drawable.honor30pro_plus_1024x768,
            R.drawable.honor_30_pro_1,
            R.drawable.honor_30,
    };

    public static ArrayList<HandPhone> getHonorPhoneList() {
        ArrayList<HandPhone> phones = new ArrayList<>();
        for (int position = 0; position < honorPhone.length; position++) {
            HandPhone handPhone = new HandPhone();
            handPhone.setBrand(honorPhone[position]);
            handPhone.setPrice(honorPrice[position]);
            handPhone.setPhoto(honorPhoto[position]);
            phones.add(handPhone);
        }
        return phones;
    }
}
