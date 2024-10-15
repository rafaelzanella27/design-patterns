package org.example.adapter.mercadopago;

import org.example.adapter.utils.Token;

public class MercadoPago implements IMercadoPagoPayments{

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendMarketPayment() {
        authToken();
        System.out.println("Enviando pagamentos via Mercado Pago");
    }

    @Override
    public void receiveMarketPayment() {
        System.out.println("Recebendo pagamentos via Mercado Pago");
    }
}
