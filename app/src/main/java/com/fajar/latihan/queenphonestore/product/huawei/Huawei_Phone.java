package com.fajar.latihan.queenphonestore.product.huawei;

import com.fajar.latihan.queenphonestore.R;
import com.fajar.latihan.queenphonestore.product.HandPhone;

import java.util.ArrayList;

public class Huawei_Phone {
    private static String[] huaweiPhone = {
            "Huawei P30 Pro 2020",
            "Huawei Mate 30 Pro",
            "Huawei Nova 7 Pro 5G",
    };

    private static String[] huaweiPrice = {
            "Rp. 14.599.000",
            "Rp. 14.499.000",
            "Rp. 6.199.000",
    };

    private static int[] huaweiPhoto = {
            R.drawable.huawei_p30pronew,
            R.drawable.huawei_mate30pro,
            R.drawable.huawei_nova7pro5g,
    };

    public static ArrayList<HandPhone> getHuaweiPhoneList() {
        ArrayList<HandPhone> phones = new ArrayList<>();
        for (int position = 0; position < huaweiPhone.length; position++) {
            HandPhone handPhone = new HandPhone();
            handPhone.setBrand(huaweiPhone[position]);
            handPhone.setPrice(huaweiPrice[position]);
            handPhone.setPhoto(huaweiPhoto[position]);
            phones.add(handPhone);
        }
        return phones;
    }
}
