package com.fajar.latihan.queenphonestore.product.xiaomi;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.fajar.latihan.queenphonestore.R;
import com.fajar.latihan.queenphonestore.product.HandPhone;
import com.fajar.latihan.queenphonestore.product.Product_Model;
import com.fajar.latihan.queenphonestore.product.ProductsGrid_Adapter;

import java.util.ArrayList;

public class Xiaomi_Activity extends AppCompatActivity {
    public static final String EXTRA_BRANDS = "";
    ArrayList<HandPhone> listOFProduct = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_of_brands);

        Product_Model productModel = getIntent().getParcelableExtra(EXTRA_BRANDS);
        ImageView imageView = findViewById(R.id.image_grid_home_);

        if (productModel != null) {
            imageView.setImageResource(productModel.getProduct_Photo());
        }

        RecyclerView rvBrand_Home = findViewById(R.id.rv_brand_home);
        rvBrand_Home.setHasFixedSize(true);
        rvBrand_Home.setLayoutManager(new GridLayoutManager(this, 2));
        ProductsGrid_Adapter adapter = new ProductsGrid_Adapter(listOFProduct);
        listOFProduct.addAll(Xiaomi_Phone.getHuaweiPhoneList());
        rvBrand_Home.setAdapter(adapter);

    }
}
