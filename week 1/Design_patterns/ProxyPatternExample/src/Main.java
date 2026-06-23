import Images.Impl.ProxyImage;

public class Main {
    public static void main(String[] args) {
        ProxyImage image = new ProxyImage("https://picsum.photos/300");
        image.display();
    }
}