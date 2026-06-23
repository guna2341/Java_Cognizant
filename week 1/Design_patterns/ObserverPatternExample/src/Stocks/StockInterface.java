package Stocks;

public interface StockInterface {

    void register(Observer observer, String stock);
    void deregister(Observer observer, String stock);
    void notifyObservers(String title, String stock);

}
