package com.rohit.app.model;

import com.rohit.app.controller.StudentController;

public class Student
{
    String name;
    int roll;
    String std;
    String schoolname;

    public Student(String name, int roll, String std, String schoolname) {
        this.name = name;
        this.roll = roll;
        this.std = std;
        this.schoolname = schoolname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }



}
