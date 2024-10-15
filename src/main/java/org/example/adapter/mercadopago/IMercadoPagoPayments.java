package org.example.adapter.mercadopago;

import org.example.adapter.utils.Token;

public interface IMercadoPagoPayments {

    Token authToken();
    void sendMarketPayment();
    void receiveMarketPayment();
}
