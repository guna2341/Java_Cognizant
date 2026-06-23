package Stocks.Impl;


import Stocks.Observer;

public class MobileApp implements Observer {

    private final String user;

    public MobileApp(String user) {
        this.user = user;
    }

    @Override
    public String update(String title) {
        return this.user + ": " + title + " from mobile app.";
    }
}
