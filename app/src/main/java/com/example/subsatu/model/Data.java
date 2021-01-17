package com.example.subsatu.model;

import android.os.Parcel;
import android.os.Parcelable;
public class Data implements Parcelable {

    private int avatar1;
    private String username1;
    private String name1;
    private String company1;
    private String location1;
    private String repository1;
    private String follower1;
    private String following1;

    public Data(int Avatar, String usename, String name, String company, String location, String repository, String follower, String following) {
        avatar1 = Avatar;
        username1 = usename;
        name1 = name;
        company1 = company;
        location1 = location;
        repository1 = repository;
        follower1 = follower;
        following1 = following;
    }
    protected Data(Parcel in) {
        avatar1 = in.readInt();
        username1 = in.readString();
        name1 = in.readString();
        company1 = in.readString();
        location1 = in.readString();
        repository1 = in.readString();
        follower1 = in.readString();
        following1 = in.readString();

    }
    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }
        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };
    public int getAvatar1() {
        return avatar1;
    }

    public String getUsername1() {
        return username1;
    }

    public String getName1() {
        return name1;
    }

    public String getCompany1() {
        return company1;
    }

    public String getLocation1() {
        return location1;
    }

    public String getRepository1() {
        return repository1;
    }

    public String getFollower1() {
        return follower1;
    }

    public String getFollowing1() {
        return following1;
    }
    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(avatar1);
        dest.writeString(username1);
        dest.writeString(name1);
        dest.writeString(company1);
        dest.writeString(location1);
        dest.writeString(repository1);
        dest.writeString(follower1);
        dest.writeString(following1);

    }
}