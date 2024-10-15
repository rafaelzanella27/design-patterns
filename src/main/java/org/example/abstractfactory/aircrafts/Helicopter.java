package org.example.abstractfactory.aircrafts;

public class Helicopter implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros OK, Ligando hélices");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25km, Suldeste, Ventos ok!");
    }
}
