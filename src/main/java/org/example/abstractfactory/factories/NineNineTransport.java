package org.example.abstractfactory.factories;

import org.example.abstractfactory.aircrafts.Helicopter;
import org.example.abstractfactory.aircrafts.IAircraft;
import org.example.abstractfactory.boats.Boat;
import org.example.abstractfactory.boats.IBoat;
import org.example.abstractfactory.landvehicles.ILandVehicle;
import org.example.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
