package org.example.builder.cars;

import org.example.builder.components.CarType;
import org.example.builder.components.ColorType;
import org.example.builder.components.Engine;
import org.example.builder.components.Transmission;

public class Car {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final ColorType colorType;

    public Car(CarType carType,
               int seats,
               Engine engine,
               Transmission transmission, ColorType colorType) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.colorType = colorType;
    }

    public CarType getCarType(){
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public ColorType getColorType() {
        return colorType;
    }
}
