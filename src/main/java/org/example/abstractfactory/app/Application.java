package org.example.abstractfactory.app;

import org.example.abstractfactory.aircrafts.IAircraft;
import org.example.abstractfactory.boats.IBoat;
import org.example.abstractfactory.factories.ITransportFactory;
import org.example.abstractfactory.landvehicles.ILandVehicle;

public class Application {

    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private IBoat boat;

    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
        boat = factory.createTransportBoat();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
        boat.startRoute();
    }
}
