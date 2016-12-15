package com.android.olegp.intentseconddemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by olegp on 27.10.2016.
 */

public class Person implements Parcelable {

    public static Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel source) {

            Person np = new Person(source.readString(), source.readString(), source.readInt(), source.readFloat());

            return np;
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[0];
        }
    };
    String fname, lname;
    int age;
    float rating;

    public Person(String fname, String lname, int age, float rating) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.rating = rating;

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        return "First name: " + fname + '\n' +
                "Surname: " + lname + '\n' +
                "Age: " + age + '\n' +
                "Rating: " + rating;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.fname);
        dest.writeString(this.lname);
        dest.writeInt(this.age);
        dest.writeFloat(this.rating);

    }
}
