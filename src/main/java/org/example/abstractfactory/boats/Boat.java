package org.example.abstractfactory.boats;

public class Boat implements IBoat{
    @Override
    public void startRoute() {
        sea();
        getCargo();
        System.out.println("Iniciando navegação");
    }

    @Override
    public void getCargo() {
        System.out.println("Tripulantes a bordo.");
    }

    @Override
    public void sea() {
        System.out.println("Maré OK");
    }
}
