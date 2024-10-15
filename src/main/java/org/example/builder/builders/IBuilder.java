package org.example.builder.builders;

import org.example.builder.components.CarType;
import org.example.builder.components.ColorType;
import org.example.builder.components.Engine;
import org.example.builder.components.Transmission;

public interface IBuilder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
    void setColor(ColorType color);
}
