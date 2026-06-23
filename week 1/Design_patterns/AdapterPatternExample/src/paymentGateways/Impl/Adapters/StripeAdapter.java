package paymentGateways.Impl.Adapters;

import paymentGateways.Impl.StripeGateway;
import paymentGateways.PaymentProcessor;

public class StripeAdapter implements PaymentProcessor {

    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public String processPayment() {
        return stripeGateway.transferPayment();
    }
}
