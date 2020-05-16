package com.fajar.latihan.queenphonestore.product.vivo;

import com.fajar.latihan.queenphonestore.R;
import com.fajar.latihan.queenphonestore.product.HandPhone;

import java.util.ArrayList;

public class Vivo_Phone {
    private static String[] vivoPhone = {
            "Vivo Nex 3s 5G",
            "Vivo Nex 3 5G",
            "Vivo Z1 Pro",
    };

    private static String[] vivoPrice = {
            "Rp. 10.599.000",
            "Rp. 9.499.000",
            "Rp. 2.499.000",
    };

    private static int[] vivoPhoto = {
            R.drawable.vivo_nex_3s_5g,
            R.drawable.vivo_nex3_5g_2,
            R.drawable.vivo_z1_p_pro,
    };

    public static ArrayList<HandPhone> getHuaweiPhoneList() {
        ArrayList<HandPhone> phones = new ArrayList<>();
        for (int position = 0; position < vivoPhone.length; position++) {
            HandPhone handPhone = new HandPhone();
            handPhone.setBrand(vivoPhone[position]);
            handPhone.setPrice(vivoPrice[position]);
            handPhone.setPhoto(vivoPhoto[position]);
            phones.add(handPhone);
        }
        return phones;
    }
}
