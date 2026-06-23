package Model.Impl;

import Model.ProductInterface;

public class Product implements ProductInterface {

    final private String id;
    private String name;
    private int quantity;
    private double price;

    public Product(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public ProductInterface setProductName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ProductInterface setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    @Override
    public ProductInterface setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getProductName() {
        return this.name;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public double getPrice() {
        return this.price;
    }


}
