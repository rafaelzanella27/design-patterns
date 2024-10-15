package org.example.builder.cars;

import org.example.builder.components.CarType;
import org.example.builder.components.ColorType;
import org.example.builder.components.Engine;
import org.example.builder.components.Transmission;

public class Truck {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final ColorType colorType;

    public Truck(CarType carType, int seats, Engine engine, Transmission transmission, ColorType colorType) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.colorType = colorType;
    }

    public String result(){
        String truck = "Truck with motor: " + engine.getPower() + "\n";
        truck += " Transmission: " + transmission;

        return truck;
    }
}
