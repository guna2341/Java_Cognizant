package Controller;

import Model.ProductInterface;

import java.util.ArrayList;

public interface ControllerInterface {

    public void addProduct(String productId, String productName, int quantity, double price);

    public void removeProduct(String id);

    public void getProducts();

    public void getProductById(String id);

}
