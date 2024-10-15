package org.example.adapter;

import org.example.adapter.adapters.MercadoPagoAdapter;
import org.example.adapter.mercadopago.MercadoPago;
import org.example.adapter.paypal.IPaypalPayments;


//Design Patter- Adapter para adapter um novo meio de pagamento, sem quebrar os código existente.
//Permite conectar Interfaces incompatíveis e faze-las trabalharem juntas.
public class MainAdapter {
    public static void main(String[] args) {

        //IPayonnerPayments payment = new Payoneer();

        IPaypalPayments payment = new MercadoPagoAdapter(new MercadoPago());
        payment.paypalPayment();
        payment.paypalReceive();


    }

}
