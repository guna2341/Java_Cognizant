import paymentGateways.Impl.Adapters.PaypalAdapter;
import paymentGateways.Impl.Adapters.RazorPayAdapter;
import paymentGateways.Impl.Adapters.StripeAdapter;
import paymentGateways.Impl.PaypalGateway;
import paymentGateways.Impl.RazorPayGateway;
import paymentGateways.Impl.StripeGateway;

public class Main {
    public static void main(String[] args) {
        PaypalAdapter paypalAdapter = new PaypalAdapter(new PaypalGateway());
        paypalAdapter.processPayment();

        RazorPayAdapter razorPayAdapter = new RazorPayAdapter(new RazorPayGateway());
        razorPayAdapter.processPayment();

        StripeAdapter stripeAdapter = new StripeAdapter(new StripeGateway());
        stripeAdapter.processPayment();
    }
}