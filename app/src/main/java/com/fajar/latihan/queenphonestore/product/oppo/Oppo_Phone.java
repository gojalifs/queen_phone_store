package com.fajar.latihan.queenphonestore.product.oppo;

import com.fajar.latihan.queenphonestore.R;
import com.fajar.latihan.queenphonestore.product.HandPhone;

import java.util.ArrayList;

public class Oppo_Phone {
    private static String[] oppoPhone = {
            "OPPO Find X2 Pro",
            "OPPO Find X2 Neo",
            "OPPO Reno 10x Zoom",
            "OPPO Reno 3 Pro",
            "OPPO Reno 3 Pro 5G",
            "OPPO Reno 3",

    };

    private static String[] oppoPrice = {
            "Rp. 9.599.000",
            "Rp. 9.499.000",
            "Rp. 8.199.000",
            "Rp. 8.799.000",
            "Rp. 9.199.000",
            "Rp. 7.799.000",
    };

    private static int[] oppoPhoto = {
            R.drawable.oppo_find_x2_pro,
            R.drawable.oppo_find_x2neo,
            R.drawable.oppo_reno10x_zoom,
            R.drawable.oppo_reno3_pro_spek,
            R.drawable.oppo_reno_3pro_5g,
            R.drawable.oppo_reno_3,
    };

    public static ArrayList<HandPhone> getOppoPhoneList() {
        ArrayList<HandPhone> phones = new ArrayList<>();
        for (int position = 0; position < oppoPhone.length; position++) {
            HandPhone handPhone = new HandPhone();
            handPhone.setBrand(oppoPhone[position]);
            handPhone.setPrice(oppoPrice[position]);
            handPhone.setPhoto(oppoPhoto[position]);
            phones.add(handPhone);
        }
        return phones;
    }
}
