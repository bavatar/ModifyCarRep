package com.company;

public abstract class Vehicle {
    // vehicle can run, stop and accelerate
    private String carName = "";
    private String vehicleColor = "";
    private int speed = 0;
    private boolean carAccelerating = false;
    private boolean vehicleStopped = true;

    public Vehicle() {
    }

    public Vehicle(String carName, String vehicleColor) {
        this.carName = carName;
        this.vehicleColor = vehicleColor;
        this.speed= 0;
        this.carAccelerating = false;
        this.vehicleStopped = true;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int carSpeed) {
//        if (carSpeed == 0) {
//            setCarStopped(true);
//        }
//        else {
//            setCarStopped(false);
//            setCarAccelerating(true);
//        }
        this.speed = carSpeed;
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
        return vehicleStopped;
    }

    public void setCarStopped(boolean carStopped) {
        if (carStopped){
            setCarAccelerating(false);
            setSpeed(0);
        }
        this.vehicleStopped = carStopped;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }
}
