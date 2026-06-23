import Stocks.Impl.MobileApp;
import Stocks.Impl.StockMarket;
import Stocks.Impl.WebApp;
import Stocks.Observer;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobileuser1 = new MobileApp("User1");
        Observer mobileuser2 = new MobileApp("User2");
        Observer webuser1 = new WebApp("User3");
        Observer webuser2 = new WebApp("User4");
        market.register( mobileuser1, "apple");
        market.register(mobileuser2, "apple");
        market.register(webuser1, "tesla");
        market.register(webuser2, "tesla");
        market.notifyObservers("Apple stock increased by 10%", "apple");
        market.notifyObservers("Tesla stock decreased by 15%", "tesla");
    }
}