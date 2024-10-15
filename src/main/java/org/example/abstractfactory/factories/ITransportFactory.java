package org.example.abstractfactory.factories;

import org.example.abstractfactory.aircrafts.IAircraft;
import org.example.abstractfactory.boats.IBoat;
import org.example.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {

    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    IBoat createTransportBoat();
}
