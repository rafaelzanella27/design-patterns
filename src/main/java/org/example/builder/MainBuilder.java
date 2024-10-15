package org.example.builder;

import org.example.builder.builders.CarBuilder;
import org.example.builder.builders.SportCarBuilder;
import org.example.builder.builders.TruckBuilder;
import org.example.builder.cars.Car;
import org.example.builder.cars.Truck;
import org.example.builder.director.Director;

//Design Pattern Builder - para construir objetos complexos
public class MainBuilder {
    public static void main(String[] args) {

        Director director = new Director();

//        //criando o carro
//        CarBuilder builder = new CarBuilder();
//        director.constructSedanCar(builder);
//
//        Car car = builder.getResult();
//        System.out.println(car.getCarType() + " produzido com sucesso!");

        //criando caminhao
        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();
        System.out.println("Caminhao: " +truck.result());

        //criando carro esportivo
        SportCarBuilder sportCarBuilder = new SportCarBuilder();
        director.constructSportCar(sportCarBuilder);

        Car sportCar = sportCarBuilder.getResult();
        System.out.println(sportCar.getCarType() + " produzido com sucesso!");

    }
}
