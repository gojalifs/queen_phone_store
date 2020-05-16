package com.fajar.latihan.queenphonestore.hotproduct;

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
import com.fajar.latihan.queenphonestore.R.layout;

import java.util.ArrayList;

public class ListOFHotProduct_Adapter extends RecyclerView.Adapter<ListOFHotProduct_Adapter.ListViewHolder> {
    private ArrayList<HotProduct_Model> allHotProduct;

    public ListOFHotProduct_Adapter(ArrayList<HotProduct_Model> allHotProduct) {
        this.allHotProduct = allHotProduct;
    }

    @NonNull
    @Override
    public ListOFHotProduct_Adapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(layout.hot_product, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListOFHotProduct_Adapter.ListViewHolder holder, int position) {
        HotProduct_Model model = allHotProduct.get(position);

        Glide.with(holder.itemView.getContext())
                .load(model.getHotProduct_Photo())
                .apply(new RequestOptions().override(90, 90))
                .into(holder.img_HotProduct);
        holder.tv_sold.setText(model.getHotProduct_Sold());
        holder.tv_Price.setText(model.getHotProduct_Price());

    }

    @Override
    public int getItemCount() {
        return allHotProduct.size();
    }

    static class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView img_HotProduct;
        TextView tv_Price, tv_sold;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            img_HotProduct = itemView.findViewById(R.id.img_hot_product);
            tv_Price = itemView.findViewById(R.id.tv_hot_price);
            tv_sold = itemView.findViewById(R.id.tv_hot_sold);
        }
    }
}
