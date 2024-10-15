package org.example.factory;

import org.example.factory.vehicles.Car;
import org.example.factory.vehicles.IVehicle;

//Classe concreta
public class CarTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
