package com.company;

public class Main {

    public static void main(String[] args) {
	    TransportCompanyInterface transportCompany = new TransportCompany();
        Ship ship = transportCompany.createShip(60, 200, "Верный");
        Airplane airplane = transportCompany.createAirplane(300, 10, 125);
        Truck truck = transportCompany.createTruck(100, 15, "1786AB", "Дизель");
    }
}

