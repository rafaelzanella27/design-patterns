package org.example.adapter.payoneer;

import org.example.adapter.utils.Token;

public class Payoneer implements IPayonnerPayments{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamentos via Payoneer");
    }

    @Override
    public void receivePayment() {
        System.out.println("Receebendo pagamentos via Payoneer");
    }
}
