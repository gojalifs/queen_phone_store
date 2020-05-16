package com.fajar.latihan.queenphonestore.hotproduct;

import com.fajar.latihan.queenphonestore.R;

import java.util.ArrayList;

public class
HotProduct_Data {
    private static int[] hotProductLogo = {
            R.drawable.samsung_s20ultra,
            R.drawable.huawei_mate30pro,
            R.drawable.realme_x2pro,
            R.drawable.realme_6pro,
            R.drawable.huawei_p30pronew,
    };

    private static String[] hotProductPrice = {
            "Rp. 14.999.000",
            "Rp. 15.499.000",
            "Rp. 7.800.000",
            "Rp. 4.599.000",
            "Rp. 14.599.000",
    };

    private static String[] hotProductName = {
            "Samsung S20 Ultra",
            "Huawei mate 30 Pro",
            "Realme X2 Pro",
            "Realme 6 Pro",
            "Huawei P30 Pro New",
    };

    public static ArrayList<HotProduct_Model> getHotProduct_models() {
        ArrayList<HotProduct_Model> hotProduct_modelArrayList = new ArrayList<>();
        for (int i = 0; i < hotProductLogo.length; i++) {
            HotProduct_Model hotProduct_model = new HotProduct_Model();
            hotProduct_model.setHotProduct_Photo(hotProductLogo[i]);
            hotProduct_model.setHotProduct_Price(hotProductPrice[i]);
            hotProduct_model.setHotProduct_Sold(hotProductName[i]);

            hotProduct_modelArrayList.add(hotProduct_model);
        }
        return hotProduct_modelArrayList;
    }

}
