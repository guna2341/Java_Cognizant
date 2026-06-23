package Controller.Impl;

import Controller.ControllerInterface;
import Model.ProductInterface;
import Repository.Impl.ProductRepo;
import Repository.ProductRepoInterface;
import Services.Impl.ProductService;
import Services.ProductServiceInterface;
import View.ProductViewInterface;

public class ProductController implements ControllerInterface {

    final private ProductServiceInterface service;
    final private ProductViewInterface view;

    public ProductController(ProductService service, ProductViewInterface view) {
        this.service = service;
        this.view = view;
    }

    @Override
    public void addProduct(String productId, String productName, int quantity, double price) {
        service.addProduct(productId, productName, quantity, price);
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
}
