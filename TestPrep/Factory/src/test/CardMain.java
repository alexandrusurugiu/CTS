package test;

import clase.payment.IPayment;
import clase.payment.PaymentFactory;

public class CardMain {
    public static void main(String[] args) {
        IPayment payment = PaymentFactory.createPayment("paypal", "paypal@gmail.com");
        IPayment payment2 = PaymentFactory.createPayment("card", "460043");

        payment.proccessPayment(4500);
        payment2.proccessPayment(1000);

        //crapa
        IPayment payment3 = PaymentFactory.createPayment("ordin bancar", "nikobellic@gmail.com");
        payment3.proccessPayment(4500);
    }
}
