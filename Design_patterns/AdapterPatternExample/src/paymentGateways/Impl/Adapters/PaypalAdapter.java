package paymentGateways.Impl.Adapters;

import paymentGateways.Impl.PaypalGateway;
import paymentGateways.PaymentProcessor;

public class PaypalAdapter implements PaymentProcessor {

    private final PaypalGateway paypalGateway;

    public PaypalAdapter(PaypalGateway paypalGateway) {
        this.paypalGateway = paypalGateway;
    }

    @Override
    public String processPayment() {
        return paypalGateway.sendPayment();
    }
}
