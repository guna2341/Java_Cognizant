package Payment.Impl;

import Payment.PaymentStrategy;

public class PaypalPayment implements PaymentStrategy {
    @Override
    public String pay() {
        return "Payment from paypay.";
    }
}
