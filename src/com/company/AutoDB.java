package com.company;

import java.util.ArrayList;
import java.util.List;

public class AutoDB {
    private Car car;
    private List<Car> cars;

    public AutoDB() {
        cars = new ArrayList<>();
        // Create initial set of cars
        // Vehicle(String carName, String carColor) - use super(..)
        car = new Car("Porsche 911", "red", "Bob");
        //int test = car.getCarSpeed();
        //car.setCarName(crName);
        cars.add(car);
        car = new Car("Ferrari", "red", "Bob");
        cars.add(car);
        car = new Car("Lamborgini", "pink", "Andy");
        cars.add(car);
        car = new Car("Mazda", "white", "Sue");
        cars.add(car);
        car = new Car("Ford F150", "mauve", "Randy");
        cars.add(car);
        car = new Car("Maserati", "turquoise", "Michael");
        cars.add(car);
    }

    public String getStatusCars(){
        // The red Porsche is starting
        // red porsche is being driven by Bob.
        String outStr = "";
        String name = "";
        String color = "";
        int speed = 0;
        for (Car c : cars){
            //c.setCurStatus(Car.Status.TRAVELING);
            c.setCurSpeed(60);
            //c.setCurStatus(Car.Status.TRAVELING);
            color = c.getVehicleColor();
            name = c.getCarName();
            speed = c.getCurSpeed();
            outStr += "The " + color + " " + c.getCarName();
            outStr += " " + c.driver.toString() + " and is ";
            outStr += c.getCurStatus() + " and moving at " + speed + " mph\n";
        }
        return outStr;
    }

    public void addCar(Car c){
        cars.add(c);
    }
}
