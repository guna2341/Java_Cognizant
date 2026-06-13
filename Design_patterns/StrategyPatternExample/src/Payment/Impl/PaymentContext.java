package Payment.Impl;

import Payment.PaymentStrategy;

public class PaymentContext implements PaymentStrategy {

    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    @Override
    public String pay() {
        return paymentStrategy.pay();
    }
}
