package com.fajar.latihan.queenphonestore.hotproduct;

import android.os.Parcel;
import android.os.Parcelable;

public class HotProduct_Model implements Parcelable {
    public static final Parcelable.Creator<HotProduct_Model> CREATOR = new Parcelable.Creator<HotProduct_Model>() {
        @Override
        public HotProduct_Model createFromParcel(Parcel source) {
            return new HotProduct_Model(source);
        }

        @Override
        public HotProduct_Model[] newArray(int size) {
            return new HotProduct_Model[size];
        }
    };
    private int hotProduct_Photo;
    private String hotProduct_Price;
    private String hotProduct_Sold;

    public HotProduct_Model() {
    }

    protected HotProduct_Model(Parcel in) {
        this.hotProduct_Photo = in.readInt();
        this.hotProduct_Price = in.readString();
        this.hotProduct_Sold = in.readString();
    }

    public int getHotProduct_Photo() {
        return hotProduct_Photo;
    }

    public void setHotProduct_Photo(int hotProduct_Photo) {
        this.hotProduct_Photo = hotProduct_Photo;
    }

    public String getHotProduct_Price() {
        return hotProduct_Price;
    }

    public void setHotProduct_Price(String hotProduct_Price) {
        this.hotProduct_Price = hotProduct_Price;
    }

    public String getHotProduct_Sold() {
        return hotProduct_Sold;
    }

    public void setHotProduct_Sold(String hotProduct_Sold) {
        this.hotProduct_Sold = hotProduct_Sold;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.hotProduct_Photo);
        dest.writeString(this.hotProduct_Price);
        dest.writeString(this.hotProduct_Sold);
    }
}
