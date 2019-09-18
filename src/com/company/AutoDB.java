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
        car = new Car("Porsche 911", "red");
        //int test = car.getCarSpeed();
        //car.setCarName(crName);
        cars.add(car);
        car = new Car("Ferrari", "blue");
        cars.add(car);
        car = new Car("Lamborgini", "pink");
        cars.add(car);
        car = new Car("Mazda", "white");
        cars.add(car);
        car = new Car("Ford F150", "mauve");
        cars.add(car);
        car = new Car("Maserati", "turquoise");
        cars.add(car);
    }

    public String getStatusCars(){
        // The red Porsche is starting
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

            outStr += "The " + color + " " + c.getCarName() + " is ";
            outStr += c.getCurStatus() + " and moving at " + speed + " mph\n";
        }
        return outStr;
    }

    public void addCar(Car c){
        cars.add(c);
    }
}
