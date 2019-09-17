package com.company;

public abstract class Vehicle {
    // vehicle can run, stop and accelerate
    private String carName = "";
    private String carColor = "";
    private int carSpeed = 0;
    private boolean carAccelerating = false;
    private boolean carStopped = true;

    public Vehicle() {
    }

    public Vehicle(String carName, String carColor) {
        this.carName = carName;
        this.carColor = carColor;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        if (carSpeed == 0) {
            setCarStopped(true);
        }
        else {
            setCarStopped(false);
        }
        this.carSpeed = carSpeed;
    }

    public boolean isCarAccelerating() {
        return carAccelerating;
    }

    public void setCarAccelerating(boolean carAccelerating) {
        if (carAccelerating){
            setCarStopped(false);
        } else {
            setCarStopped(true);
        }
        this.carAccelerating = carAccelerating;
    }

    public boolean isCarStopped() {
        return carStopped;
    }

    public void setCarStopped(boolean carStopped) {
        if (carStopped){
            setCarAccelerating(false);
            setCarSpeed(0);
        }
        this.carStopped = carStopped;
    }
}
