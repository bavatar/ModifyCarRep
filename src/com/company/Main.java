package com.company;

import java.util.Scanner;

import static java.lang.System.exit;

// Modify your car application: Allow the user to create cars
// Now get input from the user to create a car. The input from the user should prompt for the characteristics of the car and create the object using those inputs.
//
// Next add the car object to the arraylist as follows:
//  Car car = new Car();
//
//  prompt from user and populate car class
//
//  add car to the cars arraylist
//  cars.add(car);
public class Main {
    public static void main(String[] args) {
        AutoDB autoDB = new AutoDB();
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to add a car to your car Database? (Y/N)");
        String responseStr = sc.nextLine();
        if (responseStr.equalsIgnoreCase("y")) {
            // Car(String name, String color)
            String model = "";
            String color = "";
            System.out.println("What kind of Car would you like?");
            model = sc.nextLine();
            if (model.equals("")) {
                System.out.println("Invalid Type of car.");
                exit(0);
            }

            System.out.println("What Color of Car would you like?");
            color = sc.nextLine();
            if (color.equals("")) {
                System.out.println("Invalid Color of car.");
                exit(0);
            }

            System.out.println("What is the name of your driver?");
            String driver = sc.nextLine();
            if (driver.equals("")) {
                System.out.println("Invalid car driver.");
                exit(0);
            }
            Car car = new Car(model, color, driver);
            autoDB.addCar(car);
        }

        System.out.println("Do you want to find the Status of your cars? (Y/N)");
        responseStr = sc.nextLine();
        if (responseStr.equalsIgnoreCase("y")) {
            String carsStr = autoDB.getStatusCars();
            System.out.println(carsStr);
        }
    }
}
