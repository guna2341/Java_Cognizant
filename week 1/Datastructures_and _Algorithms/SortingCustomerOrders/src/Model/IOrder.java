package Model;

public interface IOrder {

    String getId();

    String getCustomerName();

    double getTotalPrice();

    void setCustomerName(String name);

    void setTotalPrice(double price);

}
