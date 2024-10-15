package org.example.adapter.adapters;

import org.example.adapter.payoneer.Payoneer;
import org.example.adapter.paypal.IPaypalPayments;
import org.example.adapter.utils.Token;

public class PayoneerAdapter implements IPaypalPayments {

    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payoneer utilizando os métidos padroes do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.receivePayment();
    }
}
