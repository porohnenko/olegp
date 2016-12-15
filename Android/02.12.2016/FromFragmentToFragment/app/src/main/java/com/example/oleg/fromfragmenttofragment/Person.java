package com.example.oleg.fromfragmenttofragment;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by olegp on 27.10.2016.
 */

public class Person implements Parcelable {

    String fname, lname;
    int age;
    //float rating;


    public Person(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        //this.rating = rating;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
//        return "First name: " + fname + '\n' +
//                "Surname: " + lname + '\n' +
//                "Age: " + age + '\n' +
//                "Rating: " + rating
                ;return "First name: " + fname + '\n' +
                "Surname: " + lname + '\n' +
                "Age: " + age;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.fname);
        dest.writeString(this.lname);
        dest.writeInt(this.age);
        //dest.writeFloat(this.rating);
    }

    public static Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel source) {
            Person person = new Person(source.readString(), source.readString(), source.readInt());
            return person;
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };
}
