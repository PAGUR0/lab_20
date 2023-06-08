package com.company;

public class Truck extends Transport{
    String fuel;
    String number;
    public Truck(int speed, int loud_capacity, String number, String fuel) {
        this.speed = speed;
        this.load_capacity = loud_capacity;
        this.number = number;
        this.fuel = fuel;
    }
}
