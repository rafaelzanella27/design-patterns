package org.example.factory;

import org.example.factory.vehicles.IVehicle;
import org.example.factory.vehicles.Motorcycle;

//Classe concreta
public class MotorcycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
