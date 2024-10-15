package org.example.adapter.payoneer;

import org.example.adapter.utils.Token;

public interface IPayonnerPayments {

    Token authToken();
    void sendPayment();
    void receivePayment();
}
