package Model.Impl;

import Model.IOrder;

public class Order implements IOrder {

    final private String orderId;
    private String customerName;
    private double totalPrice;

    public Order(String id, String name, double price) {
        this.orderId = id;
        this.customerName = name;
        this.totalPrice = price;
    }


    @Override
    public String getId() {
        return this.orderId;
    }

    @Override
    public String getCustomerName() {
        return this.customerName;
    }

    @Override
    public double getTotalPrice() {
        return this.totalPrice;
    }

    @Override
    public void setCustomerName(String name) {
        this.customerName = name;
    }

    @Override
    public void setTotalPrice(double price) {
        this.totalPrice = price;
    }
}
