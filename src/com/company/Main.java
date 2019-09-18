package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AutoDB autoDB = new AutoDB();
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to find the Status of your cars? (Y/N)");
        String responseStr = sc.nextLine();
        if (responseStr.equalsIgnoreCase("y")) {
            String carsStr = autoDB.getStatusCars();
            System.out.println(carsStr);
        }
    }
}
