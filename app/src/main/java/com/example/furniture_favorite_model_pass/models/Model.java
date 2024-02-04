package com.example.furniture_favorite_model_pass.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Model implements Parcelable {
    String name_product;
    int price_product;
    String description_product;
    int image_product;

    public Model(String name_product, int price_product, String description_product, int image_product) {
        this.name_product = name_product;
        this.price_product = price_product;
        this.description_product = description_product;
        this.image_product = image_product;
    }

    protected Model(Parcel in) {
        name_product = in.readString();
        price_product = in.readInt();
        description_product = in.readString();
        image_product = in.readInt();
    }

    public static final Creator<Model> CREATOR = new Creator<Model>() {
        @Override
        public Model createFromParcel(Parcel in) {
            return new Model(in);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public int getPrice_product() {
        return price_product;
    }

    public void setPrice_product(int price_product) {
        this.price_product = price_product;
    }

    public String getDescription_product() {
        return description_product;
    }

    public void setDescription_product(String description_product) {
        this.description_product = description_product;
    }

    public int getImage_product() {
        return image_product;
    }

    public void setImage_product(int image_product) {
        this.image_product = image_product;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(name_product);
        dest.writeInt(price_product);
        dest.writeString(description_product);
        dest.writeInt(image_product);
    }
}
