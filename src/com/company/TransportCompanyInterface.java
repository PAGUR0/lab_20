package com.company;

public interface TransportCompanyInterface {
    Truck createTruck(int speed, int loud_capacity, String number, String fuel);
    Airplane createAirplane(int speed, int loud_capacity, int number);
    Ship createShip(int speed, int loud_capacity, String name);
}
