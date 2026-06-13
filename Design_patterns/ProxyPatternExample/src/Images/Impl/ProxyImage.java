package Images.Impl;

import Images.Image;

public class ProxyImage implements Image {

    private RealImage realImage = null;
    private String imageUrl = null;

    public ProxyImage(String filename) {
        this.imageUrl = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            this.realImage = new RealImage(imageUrl);
        }

        realImage.display();
    }
}
