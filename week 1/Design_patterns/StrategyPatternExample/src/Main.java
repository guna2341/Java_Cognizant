import Payment.Impl.CreditcartPayment;
import Payment.Impl.PaymentContext;
import Payment.Impl.PaypalPayment;
import Payment.PaymentStrategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new PaypalPayment());
        System.out.println(paymentContext.pay());
        paymentContext.setPaymentStrategy(new CreditcartPayment());
        System.out.println(paymentContext.pay());
    }
}