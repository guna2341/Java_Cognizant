package Payment.Impl;

import Payment.PaymentStrategy;

public class CreditcartPayment implements PaymentStrategy {
    @Override
    public String pay() {
        return "Payment from creditcard.";
    }
}
