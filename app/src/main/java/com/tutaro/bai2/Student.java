package com.tutaro.bai2;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by KHOE on 26/09/2017.
 */

public class Student implements Parcelable {

    private String name;
    private String hometown;
    private String birthday;
    private String maleOrFemale;
    private String classStudent;
    private String course;

    public Student(String name, String hometown, String birthday, String maleOrFemale,
                   String classStudent, String course) {
        this.name = name;
        this.hometown = hometown;
        this.birthday = birthday;
        this.maleOrFemale = maleOrFemale;
        this.classStudent = classStudent;
        this.course = course;
    }

    public Student(String name) {
        this.name = name;
    }

    protected Student(Parcel in) {
        name = in.readString();
        hometown = in.readString();
        birthday = in.readString();
        maleOrFemale = in.readString();
        classStudent = in.readString();
        course = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMaleOrFemale() {
        return maleOrFemale;
    }

    public void setMaleOrFemale(String maleOrFemale) {
        this.maleOrFemale = maleOrFemale;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(hometown);
        dest.writeString(birthday);
        dest.writeString(maleOrFemale);
        dest.writeString(classStudent);
        dest.writeString(course);
    }
}
