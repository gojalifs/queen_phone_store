package com.fajar.latihan.queenphonestore;

import android.os.Parcel;
import android.os.Parcelable;

public class Product_Model implements Parcelable {
    public static final Parcelable.Creator<Product_Model> CREATOR = new Parcelable.Creator<Product_Model>() {
        @Override
        public Product_Model createFromParcel(Parcel source) {
            return new Product_Model(source);
        }

        @Override
        public Product_Model[] newArray(int size) {
            return new Product_Model[size];
        }
    };
    private String product_Name;
    private int product_Photo;

    public Product_Model() {
    }

    protected Product_Model(Parcel in) {
        this.product_Name = in.readString();
        this.product_Photo = in.readInt();
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public int getProduct_Photo() {
        return product_Photo;
    }

    public void setProduct_Photo(int product_Photo) {
        this.product_Photo = product_Photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.product_Name);
        dest.writeInt(this.product_Photo);
    }
}
