package org.example.bridge.transmissions;

import org.example.bridge.platforms.IPlatform;

public class Live implements ITransmission{

    protected IPlatform platform;

    public Live() {
    }

    public Live(IPlatform platform){
        this.platform = platform;
    }

    @Override
    public void broadcasting() {
        System.out.println("Iniciando a Transmissão");
    }

    @Override
    public void result() {
        System.out.println("***** ON AR *****");
    }
}
