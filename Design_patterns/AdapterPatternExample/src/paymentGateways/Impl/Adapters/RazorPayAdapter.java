package paymentGateways.Impl.Adapters;

import paymentGateways.Impl.RazorPayGateway;
import paymentGateways.PaymentProcessor;

public class RazorPayAdapter implements PaymentProcessor {

    private final RazorPayGateway razorPayGateway;

    public RazorPayAdapter(RazorPayGateway razorPayGateway) {
        this.razorPayGateway = razorPayGateway;
    }

    @Override
    public String processPayment() {
        return razorPayGateway.makeTransaction();
    }
}
