package View.Impl;

import Model.ProductInterface;
import View.ProductViewInterface;

import java.util.ArrayList;

public class ProductView implements ProductViewInterface {

    @Override
    public void displayProduct(ProductInterface product) {
        System.out.println("----------------------------------------");
        String formatted = String.format("%.2f", product.getPrice());
        System.out.println("Product ID: " + product.getId() + "\nProduct Name: " + product.getProductName() + "\nProduct quantity: " + product.getQuantity() + "\nProduct price: " + formatted);
        System.out.println("----------------------------------------");
    }

    @Override
    public void displayAllProducts(ArrayList<ProductInterface> products) {
        for(ProductInterface product: products) {
            System.out.println("----------------------------------------");
            String formatted = String.format("%.2f", product.getPrice());
            System.out.println("Product ID: " + product.getId() + "\nProduct Name: " + product.getProductName() + "\nProduct quantity: " + product.getQuantity() + "\nProduct price: " + formatted);
            System.out.println("----------------------------------------");
            System.out.println();
        }
    }
}
