package com.fajar.latihan.queenphonestore;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.fajar.latihan.queenphonestore.product.Product_Model;
import com.fajar.latihan.queenphonestore.product.google.Google_Activity;
import com.fajar.latihan.queenphonestore.product.honor.Honor_Activity;
import com.fajar.latihan.queenphonestore.product.huawei.Huawei_Activity;
import com.fajar.latihan.queenphonestore.product.iphone.Iphone_Activity;
import com.fajar.latihan.queenphonestore.product.realme.Realme_Activity;
import com.fajar.latihan.queenphonestore.product.samsung.Samsung_Activity;
import com.fajar.latihan.queenphonestore.product.vivo.Vivo_Activity;
import com.fajar.latihan.queenphonestore.product.xiaomi.Xiaomi_Activity;

import java.util.ArrayList;

public class GridLogoHome_Adapter extends RecyclerView.Adapter<GridLogoHome_Adapter.GridViewHolder> {

    private ArrayList<Product_Model> allProducts;
    private ClickCallBack clickCallBack;

    public GridLogoHome_Adapter(ArrayList<Product_Model> allProducts, ClickCallBack clickCallBack) {
        this.allProducts = allProducts;
        this.clickCallBack = clickCallBack;
    }

    @NonNull
    @Override
    public GridLogoHome_Adapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_grid_home, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, final int position) {
        final Product_Model productModel = allProducts.get(position);

        holder.tvProductName.setText(productModel.getProduct_Name());
        Glide.with(holder.itemView.getContext())
                .load(productModel.getProduct_Photo())
                .apply(new RequestOptions().override(80, 80))
                .into(holder.imgProduct);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent product;

                switch (position) {
                    case 0:
                        product = new Intent(v.getContext(), Honor_Activity.class);
                        product.putExtra(Samsung_Activity.EXTRA_BRANDS, productModel);
                        product.putExtra("pos", position);
                        v.getContext().startActivity(product);
                        break;
                    case 1:
                        product = new Intent(v.getContext(), Huawei_Activity.class);
                        product.putExtra(Realme_Activity.EXTRA_BRANDS, productModel);
                        product.putExtra("pos", position);
                        v.getContext().startActivity(product);
                        break;
                    case 2:
                        product = new Intent(v.getContext(), Iphone_Activity.class);
                        product.putExtra(Huawei_Activity.EXTRA_BRANDS, productModel);
                        product.putExtra("pos", position);
                        v.getContext().startActivity(product);
                        break;
                    case 3:
                        product = new Intent(v.getContext(), Google_Activity.class);
                        product.putExtra(Huawei_Activity.EXTRA_BRANDS, productModel);
                        product.putExtra("pos", position);
                        v.getContext().startActivity(product);
                        break;
                    case 4:
                        product = new Intent(v.getContext(), Realme_Activity.class);
                        product.putExtra(Huawei_Activity.EXTRA_BRANDS, productModel);
                        product.putExtra("pos", position);
                        v.getContext().startActivity(product);
                        break;
                    case 5:
                        product = new Intent(v.getContext(), Samsung_Activity.class);
                        product.putExtra(Huawei_Activity.EXTRA_BRANDS, productModel);
                        product.putExtra("pos", position);
                        v.getContext().startActivity(product);
                        break;
                    case 6:
                        product = new Intent(v.getContext(), Vivo_Activity.class);
                        product.putExtra(Huawei_Activity.EXTRA_BRANDS, productModel);
                        product.putExtra("pos", position);
                        v.getContext().startActivity(product);
                        break;
                    case 7:
                        product = new Intent(v.getContext(), Xiaomi_Activity.class);
                        product.putExtra(Huawei_Activity.EXTRA_BRANDS, productModel);
                        product.putExtra("pos", position);
                        v.getContext().startActivity(product);
                        break;
                }


//                Intent intent = new Intent((v.getContext()), HomeOfBrands_Activity.class);

            }
        });

    }

//    public void getBrands(int selected){
//        switch (selected){
//            case
//        }
//    }

    public interface ClickCallBack {
        void onItemClick(int position);
    }

    @Override
    public int getItemCount() {
        return allProducts.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgProduct;
        TextView tvProductName;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickCallBack.onItemClick(getAdapterPosition());
                }
            });
            imgProduct = itemView.findViewById(R.id.image_grid_home);
            tvProductName = itemView.findViewById(R.id.product_name_grid_home);

        }
    }
}
