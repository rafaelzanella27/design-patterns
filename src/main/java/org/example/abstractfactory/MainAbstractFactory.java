package org.example.abstractfactory;

import org.example.abstractfactory.app.Application;
import org.example.abstractfactory.factories.BoatTransport;
import org.example.abstractfactory.factories.ITransportFactory;
import org.example.abstractfactory.factories.NineNineTransport;
import org.example.abstractfactory.factories.UberTransport;

public class MainAbstractFactory {
    public static Application configureApplication(){
        Application app;
        ITransportFactory factory;

        String company = "boat";

        if (company == "uber") {
            factory = new UberTransport();
        }else if (company == "99"){
            factory = new NineNineTransport();
        } else {
            factory = new BoatTransport();
        }
        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();
    }
}
