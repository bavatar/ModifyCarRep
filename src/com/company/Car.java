package com.company;

import java.util.ArrayList;

public class Car extends Vehicle{
    private enum Status
    {
        STOPPED, ACCELERATING, STARTING, TRAVELING;
    }

    private Status curStatus = Status.STOPPED;   // Initial
    private int curSpeed = 0;                    // Initial

    public Status getCurStatus() {
        return curStatus;
    }

    public void setCurStatus(Status curStatus) {
        this.curStatus = curStatus;
    }

    //private ArrayList<Car> cars = null; place in main

    public Car() {
        // Default Constructor uses constructor of Vehicle()
        //ArrayList<Car> cars = new ArrayList<>();// Tracks mult cars

    }
   // overloaded constructor
    // methods which return a string indicating each task the
    // car is peroforming: accelerate, setSpeed, setStop, getCurrentSpeed
    // setModel, setColor of the Car, setStart to start the car, setStop to
    // stop the car

}
