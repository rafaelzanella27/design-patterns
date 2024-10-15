package org.example.abstractfactory.factories;

import org.example.abstractfactory.aircrafts.Airplane;
import org.example.abstractfactory.aircrafts.IAircraft;
import org.example.abstractfactory.boats.Boat;
import org.example.abstractfactory.boats.IBoat;
import org.example.abstractfactory.landvehicles.Car;
import org.example.abstractfactory.landvehicles.ILandVehicle;

public class BoatTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
