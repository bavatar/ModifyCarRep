package com.company;

public abstract class Person {
    // Drivers, Pilots, Captains
    private String name;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
