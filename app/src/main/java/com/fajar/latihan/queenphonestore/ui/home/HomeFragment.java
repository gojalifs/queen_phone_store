package com.fajar.latihan.queenphonestore.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.fajar.latihan.queenphonestore.GridLogoHome_Adapter;
import com.fajar.latihan.queenphonestore.Product_Data;
import com.fajar.latihan.queenphonestore.Product_Model;
import com.fajar.latihan.queenphonestore.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private RecyclerView rvGridLogo;
    private ArrayList<Product_Model> list = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        rvGridLogo = root.findViewById(R.id.rv_gridlogo_home);
        rvGridLogo.setLayoutManager(new GridLayoutManager(getActivity(), 4));
//        rvGridLogo.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        GridLogoHome_Adapter gridLogoHome_adapter = new GridLogoHome_Adapter(list);
        list.addAll(Product_Data.getListOfProduct());
        rvGridLogo.setAdapter(gridLogoHome_adapter);


        return root;

    }
}
