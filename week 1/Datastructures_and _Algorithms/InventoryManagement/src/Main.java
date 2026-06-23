import Controller.Impl.ProductController;
import Repository.Impl.ProductRepo;
import Repository.ProductRepoInterface;
import Services.Impl.ProductService;
import View.Impl.ProductView;
import View.ProductViewInterface;

public class Main {
    public static void main(String[] args) {
        ProductRepoInterface repo = new ProductRepo();
        ProductService service = new ProductService(repo);
        ProductViewInterface view = new ProductView();
        ProductController controller = new ProductController(service, view);
        controller.addProduct("P101", "Lenovo loq", 10, 69960);
        controller.addProduct("P102", "Asus tuf", 20, 79960);
        controller.addProduct("P103", "Acer predator", 30, 89960);
        controller.addProduct("P104", "HP victus", 40, 99960);
        controller.addProduct("P105", "Asus ROG", 50, 59960);
        controller.getProducts();
        controller.removeProduct("P101");
        controller.getProductById("P101");
    }
}