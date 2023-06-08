package com.company;

public class Ship extends Transport{

    String name;
    public Ship(int speed, int loud_capacity, String name) {
        this.speed = speed;
        this.load_capacity = loud_capacity;
        this.name = name;
    }
}
