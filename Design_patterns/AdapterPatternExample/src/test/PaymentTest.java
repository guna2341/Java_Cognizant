package test;

import org.junit.Test;
import paymentGateways.Impl.Adapters.PaypalAdapter;
import paymentGateways.Impl.Adapters.RazorPayAdapter;
import paymentGateways.Impl.Adapters.StripeAdapter;
import paymentGateways.Impl.PaypalGateway;
import paymentGateways.Impl.RazorPayGateway;
import paymentGateways.Impl.StripeGateway;

import static org.junit.Assert.*;

public class PaymentTest {

    @Test
    public void testgateway() {
        PaypalAdapter paypalAdapter = new PaypalAdapter(new PaypalGateway());
        String paypal = paypalAdapter.processPayment();
        assertEquals("Payment from paypal", paypal);

        RazorPayAdapter razorPayAdapter = new RazorPayAdapter(new RazorPayGateway());
        String razor = razorPayAdapter.processPayment();
        assertEquals("Transaction from RazorPay", razor);

        StripeAdapter stripeAdapter = new StripeAdapter(new StripeGateway());
        String stripe = stripeAdapter.processPayment();
        assertEquals("Money transer from Stripe", stripe);
    }
}
