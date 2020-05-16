package com.fajar.latihan.queenphonestore.product;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.fajar.latihan.queenphonestore.R;

import java.util.ArrayList;

public class ProductsGrid_Adapter extends RecyclerView.Adapter<ProductsGrid_Adapter.GridViewHolder> {
    private ArrayList<HandPhone> phones;

    public ProductsGrid_Adapter(ArrayList<HandPhone> phones) {
        this.phones = phones;
    }

    @NonNull
    @Override
    public ProductsGrid_Adapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hot_product, parent, false);

//        GridViewHolder viewHolder = new GridViewHolder(view);
//        context = parent.getContext();

//        Product_Model productModel =

        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsGrid_Adapter.GridViewHolder holder, int position) {
        final HandPhone phone = phones.get(position);

        Glide.with(holder.itemView.getContext())
                .load(phone.getPhoto())
                .apply(new RequestOptions().override(80, 80))
                .into(holder.img_Product);
        holder.tvBrands.setText(phone.getBrand());
        holder.tvPrice.setText(phone.getPrice());

    }

    @Override
    public int getItemCount() {
        return phones.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView img_Product;
        TextView tvBrands, tvPrice;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);

            img_Product = itemView.findViewById(R.id.img_hot_product);
            tvBrands = itemView.findViewById(R.id.tv_hot_sold);
            tvPrice = itemView.findViewById(R.id.tv_hot_price);

        }
    }
}
