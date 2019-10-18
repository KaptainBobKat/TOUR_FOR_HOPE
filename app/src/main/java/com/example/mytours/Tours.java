package com.example.mytours;

public class Tours {
    private String mLocation;
    private String mSchedule;
    private String mPrice;
    private String mPhone;
    private int mImageResourceId;


    public Tours(String location, String schedule, String price, String phone, int imageResourceId) {
        mLocation = location;
        mSchedule = schedule;
        mPrice = price;
        mPhone = phone;
        mImageResourceId = imageResourceId;


    }

    public String getSchedule() {
        return mSchedule;
    }

    public String getLocation() {

        return mLocation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getPrice() {
        return mPrice;
    }

    public String getmPhone() {
        return mPhone;
    }


}
