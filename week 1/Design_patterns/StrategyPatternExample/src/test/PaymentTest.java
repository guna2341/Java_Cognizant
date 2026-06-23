package test;

import Payment.Impl.CreditcartPayment;
import Payment.Impl.PaymentContext;
import Payment.Impl.PaypalPayment;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PaymentTest {

    @Test
    public void testStrategy() {
        PaymentContext paymentContext = new PaymentContext(new PaypalPayment());
        assertNotNull(paymentContext);
        assertTrue(paymentContext.pay().equals("Payment from paypay."));
        paymentContext.setPaymentStrategy(new CreditcartPayment());
        assertTrue(paymentContext.pay().equals("Payment from creditcard."));
    }

}
