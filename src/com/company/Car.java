package com.company;

import java.util.ArrayList;

// Note that Car transforms a vehicle ->car: e.g., drives on road, has a trunk, steering wheel,
// has an engine, gas, mileage, windows, doors, rubber tires, windshield wipers, hood, trunk
public class Car extends Vehicle{
    private Status curStatus = Status.STOPPED;   // Initial
    private int curSpeed = 0;
    public Driver driver;

    public int getCurSpeed() {
        curSpeed = getSpeed();
        return curSpeed;
    }

    public void setCurSpeed(int curSpeed) {
        setSpeed(curSpeed);
        //if (curStatus.equals(Status.STOPPED))
        setCurStatus(Status.TRAVELING);
        this.curSpeed = curSpeed;
    }

    public String getAllCarStates(String carName){
//        String outStr = "";
//        String
//        outStr +=

        return "";
    }

    public enum Status
    {
        STOPPED, ACCELERATING, STARTING, TRAVELING;
    }
            // Initial

    public String getCurStatus() {
        String statusStr = curStatus.name();
        return statusStr;
    }

    public void setCurStatus(Status curStatus) {
        this.curStatus = curStatus;
    }

    //private ArrayList<Car> cars = null; place in main

    public Car(String name, String color, String driverName) {
        // Default Constructor uses constructor of Vehicle()
        //ArrayList<Car> cars = new ArrayList<>();// Tracks mult cars
        super(name, color);
        this.driver = new Driver(driverName);
    }
   // overloaded constructor
    // methods which return a string indicating each task the
    // car is peroforming: accelerate, setSpeed, setStop, getCurrentSpeed
    // setModel, setColor of the Car, setStart to start the car, setStop to
    // stop the car

}
