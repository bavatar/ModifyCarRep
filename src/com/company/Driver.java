package com.company;

public class Driver extends Person{

    public Driver() {
    }

    public Driver(String driverName) {
        setName(driverName);    // sets in Person class
    }

    @Override
    public String toString() {
        String driverName = getName();
        String outStr = "is being driven by " + driverName;
        return outStr;
    }
}
