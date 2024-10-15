package org.example.adapter.adapters;

import org.example.adapter.mercadopago.MercadoPago;
import org.example.adapter.paypal.IPaypalPayments;
import org.example.adapter.utils.Token;

public class MercadoPagoAdapter implements IPaypalPayments {

    private Token token;
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o Mercado Pago utilizando os métodos padroes do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.mercadoPago.sendMarketPayment();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPago.receiveMarketPayment();
    }
}
