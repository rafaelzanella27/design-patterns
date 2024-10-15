package org.example.adapter.paypal;

import org.example.adapter.utils.Token;

public interface IPaypalPayments {

    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
