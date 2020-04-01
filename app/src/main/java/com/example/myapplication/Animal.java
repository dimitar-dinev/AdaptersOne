package com.example.myapplication;

public class Animal {
    private String mName;
    private int mDrawableID;

    public Animal(String mName, int mDrawableID) {
        this.mName = mName;
        this.mDrawableID = mDrawableID;
    }

    public String getmName() {
        return mName;
    }

    public int getmDrawableID() {
        return mDrawableID;
    }
}
