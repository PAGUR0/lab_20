package com.company;

public class TransportCompany{
    Transport createShip(){
        return new Ship();
    }
    Transport createTruck(){
        return new Truck();
    }
    Transport createAirplane(){
        return new Airplane();
    }
}
