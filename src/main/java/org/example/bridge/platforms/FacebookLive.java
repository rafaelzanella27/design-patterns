package org.example.bridge.platforms;

public class FacebookLive implements IPlatform{
    public FacebookLive() {
        configureRMTP();
        System.out.println("Facebook: Transmissão Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizando aplicação");
    }
}
