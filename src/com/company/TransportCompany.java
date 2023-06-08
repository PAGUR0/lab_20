package com.company;

public class TransportCompany implements TransportCompanyInterface{
    @Override
    public Truck createTruck(int speed, int loud_capacity, String number, String fuel) {
        return new Truck(speed, loud_capacity, number, fuel);
    }

    @Override
    public Airplane createAirplane(int speed, int loud_capacity, int number) {
        return new Airplane(speed, loud_capacity, number);
    }

    @Override
    public Ship createShip(int speed, int loud_capacity, String name) {
        return new Ship(speed, loud_capacity, name);
    }
}
