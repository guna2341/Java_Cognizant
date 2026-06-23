package Controller;

import Model.ProductInterface;

import java.util.ArrayList;

public interface ControllerInterface {

    public void addProduct(String productId, String productName, int quantity, double price, String category);

    public void removeProduct(String id);

    public void getProducts();

    public void getProductById(String id);

    public void getProductsByLinearSearch(String id, String name, String category);

    public void getProductIdByBinarySearch(String id);

}
