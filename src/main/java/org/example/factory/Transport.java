package org.example.factory;

import org.example.factory.vehicles.IVehicle;

//Classe Factory
public abstract class Transport {

    void startTransport() {
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
