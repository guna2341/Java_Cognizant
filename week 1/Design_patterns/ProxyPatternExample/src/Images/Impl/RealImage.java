package Images.Impl;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

public class RealImage {

    private String imageUrl;
    private BufferedImage image;

    public RealImage(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    void loadFromRemoteServer() {
        try {

            URL url = new URL(imageUrl);

            this.image = ImageIO.read(url);

        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Loading" + imageUrl + "from remote server");
    }

    void display() {
        loadFromRemoteServer();
        System.out.println("Image loaded: " + imageUrl);
    }

}
