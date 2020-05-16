package com.fajar.latihan.queenphonestore.product;

import com.fajar.latihan.queenphonestore.R;

import java.util.ArrayList;

public class Product_Data {
    private static String[] productName = {
            "Honor",
            "Huawei",
            "iPhone",
            "Pixel",
            "RealMe",
            "Samsung",
            "Vivo",
            "Xiaomi"
    };

    private static int[] productLogo = {
            R.drawable.honorlogo,
            R.drawable.huaweilogo,
            R.drawable.iphonelogo,
            R.drawable.pixellogo,
            R.drawable.realmelogo,
            R.drawable.samsunglogo,
            R.drawable.vivologo,
            R.drawable.xiaomilogo
    };

    public static ArrayList<Product_Model> getListOfProduct() {
        ArrayList<Product_Model> productAllArrayList = new ArrayList<>();
        for (int position = 0; position < productName.length; position++) {
            Product_Model product_model = new Product_Model();
            product_model.setProduct_Name(productName[position]);
            product_model.setProduct_Photo(productLogo[position]);
            productAllArrayList.add(product_model);
        }
        return productAllArrayList;
    }
}

