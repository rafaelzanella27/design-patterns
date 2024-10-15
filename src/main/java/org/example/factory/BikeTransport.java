package org.example.factory;

import org.example.factory.vehicles.Bike;
import org.example.factory.vehicles.IVehicle;

//Classe concreta
public class BikeTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
