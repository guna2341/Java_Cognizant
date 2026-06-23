package Controller.Impl;

import Controller.ControllerInterface;
import Model.ProductInterface;
import Repository.Impl.ProductRepo;
import Repository.ProductRepoInterface;
import Services.Impl.ProductService;
import Services.ProductServiceInterface;
import View.ProductViewInterface;

import java.util.ArrayList;

public class ProductController implements ControllerInterface {

    final private ProductServiceInterface service;
    final private ProductViewInterface view;

    public ProductController(ProductService service, ProductViewInterface view) {
        this.service = service;
        this.view = view;
    }

    @Override
    public void addProduct(String productId, String productName, int quantity, double price, String category) {
        service.addProduct(productId, productName, quantity, price, category);
    }

    @Override
    public void removeProduct(String id) {
        service.removeProduct(id);
    }

    @Override
    public void getProducts() {
        view.displayAllProducts(service.getProducts());
    }

    @Override
    public void getProductById(String id) {
        ProductInterface product = service.getProductById(id);
        if (product == null) {
            System.out.println("Product with ID: " + id + " does not exists.");
            return;
        }
        view.displayProduct(product);
    }

    @Override
    public void getProductsByLinearSearch(String id, String name, String category) {
         view.displayAllProducts(service.getProductsByLinearSearch(id, name, category));
    }

    @Override
    public void getProductIdByBinarySearch(String id) {
        view.displayProduct(service.getProductIdByBinarySearch(id));
    }
}
