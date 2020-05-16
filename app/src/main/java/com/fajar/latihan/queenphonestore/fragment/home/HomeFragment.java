package com.fajar.latihan.queenphonestore.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.fajar.latihan.queenphonestore.GridLogoHome_Adapter;
import com.fajar.latihan.queenphonestore.R;
import com.fajar.latihan.queenphonestore.hotproduct.HotProduct_Data;
import com.fajar.latihan.queenphonestore.hotproduct.HotProduct_Model;
import com.fajar.latihan.queenphonestore.hotproduct.ListOFHotProduct_Adapter;
import com.fajar.latihan.queenphonestore.product.Product_Data;
import com.fajar.latihan.queenphonestore.product.Product_Model;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private RecyclerView rvGridLogo, rvHotProduct;
    private ArrayList<Product_Model> listOFProduct = new ArrayList<>();
    private ArrayList<HotProduct_Model> listOfHotProduct = new ArrayList<>();


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);


        //RecyclerView for grid of product on Home Screen
        rvGridLogo = root.findViewById(R.id.rv_gridlogo_home);
        rvGridLogo.setHasFixedSize(true);
        rvGridLogo.setLayoutManager(new GridLayoutManager(getActivity(), 4));
        GridLogoHome_Adapter gridLogoHome_adapter = new GridLogoHome_Adapter(listOFProduct, null);
        listOFProduct.addAll(Product_Data.getListOfProduct());
        rvGridLogo.setAdapter(gridLogoHome_adapter);

        //RecyclerView for list of hot product on home screen
        rvHotProduct = root.findViewById(R.id.rv_hotproduct);
        rvHotProduct.setHasFixedSize(true);
        rvHotProduct.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        ListOFHotProduct_Adapter listOFHotProduct_adapter = new ListOFHotProduct_Adapter(listOfHotProduct);
        listOfHotProduct.addAll(HotProduct_Data.getHotProduct_models());
        rvHotProduct.setAdapter(listOFHotProduct_adapter);

        return root;

    }
}
