package org.example.builder.builders;

import org.example.builder.cars.Car;
import org.example.builder.components.CarType;
import org.example.builder.components.ColorType;
import org.example.builder.components.Engine;
import org.example.builder.components.Transmission;

public class CarBuilder implements IBuilder{
    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;
    private ColorType colorType;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setColor(ColorType color) {
        this.colorType = colorType;
    }

    public Car getResult(){
        return new Car(carType, seats, engine, transmission, colorType);
    }
}
