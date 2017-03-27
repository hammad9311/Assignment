package com.example.dell.assignment;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Zephyr on 3/21/2017.
 */
//implementation of parcable method
public class Person implements Parcelable {
    private String name;
    private  String contactNo;

    Person(String name,String contactNo){
        this.name=name;
        this.contactNo=contactNo;


    }

    public String getContactNo() {
        return this.contactNo;
    }


    public String  getName(){
        return this.name;
    }
    public String toString(){
        return name;
    }

    // 99.9% of the time you can just ignore this
    @Override
    public int describeContents() {
        return 0;
    }

    // write your object's data to the passed-in Parcel
    @Override
    public void writeToParcel(Parcel out, int flags) {

        out.writeString(name);

        out.writeString(contactNo);
    }

    // this is used to regenerate your object. All Parcelables must have a CREATOR that implements these two methods
    public static final Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>() {
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    // example constructor that takes a Parcel and gives you an object populated with it's values
    private Person(Parcel in) {
        name = in.readString();

        contactNo=in.readString();
    }

}

