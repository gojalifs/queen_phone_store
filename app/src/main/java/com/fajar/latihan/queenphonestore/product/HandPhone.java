package com.fajar.latihan.queenphonestore.product;

import android.os.Parcel;
import android.os.Parcelable;

public class HandPhone implements Parcelable {
    public static final Parcelable.Creator<HandPhone> CREATOR = new Parcelable.Creator<HandPhone>() {
        @Override
        public HandPhone createFromParcel(Parcel source) {
            return new HandPhone(source);
        }

        @Override
        public HandPhone[] newArray(int size) {
            return new HandPhone[size];
        }
    };
    private String brand, price;
    private int photo;

    public HandPhone() {
    }

    protected HandPhone(Parcel in) {
        this.brand = in.readString();
        this.price = in.readString();
        this.photo = in.readInt();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String harga) {
        this.price = harga;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.brand);
        dest.writeString(this.price);
        dest.writeInt(this.photo);
    }
}
