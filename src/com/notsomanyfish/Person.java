package com.notsomanyfish;

public class Person {
    private String name;
    private String gender;
    private int dateCount =0;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public int getDateCount() {
        return dateCount;
    }

    public void setDateCount() {
         dateCount++;
    }
}
