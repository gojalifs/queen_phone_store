package com.fajar.latihan.queenphonestore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridLogoHome_Adapter extends RecyclerView.Adapter<GridLogoHome_Adapter.GridViewHolder> {

    private ArrayList<Product_Model> allProducts;

    public GridLogoHome_Adapter(ArrayList<Product_Model> allProducts) {
        this.allProducts = allProducts;
    }

    @NonNull
    @Override
    public GridLogoHome_Adapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_grid_home, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
        Product_Model all = allProducts.get(position);

        holder.tvProductName.setText(all.getProduct_Name());
        Glide.with(holder.itemView.getContext())
                .load(all.getProduct_Photo())
                .apply(new RequestOptions().override(80, 80))
                .into(holder.imgProduct);

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
            imgProduct = itemView.findViewById(R.id.image_grid_home);
            tvProductName = itemView.findViewById(R.id.product_name_grid_home);

        }
    }
}
