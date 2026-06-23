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
        controller.addProduct("P105", "Lenovo loq", 10, 69960, "Electronics");
        controller.addProduct("P104", "Asus tuf", 20, 79960, "Electronics");
        controller.addProduct("P103", "Acer predator", 30, 89960, "Electronics");
        controller.addProduct("P102", "HP victus", 40, 99960, "Electronics");
        controller.addProduct("P101", "Asus ROG", 50, 59960, "Electronics");
        System.out.println("Linear search with O(n) Time complexity");
        controller.getProductsByLinearSearch("P105", "Lenove loq", "Electronics");
        System.out.println("Binary search with O(log n) Time complexity");
        controller.getProductIdByBinarySearch("P101");
    }
}