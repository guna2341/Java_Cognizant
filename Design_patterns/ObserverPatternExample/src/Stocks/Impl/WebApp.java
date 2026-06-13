package Stocks.Impl;

import Stocks.Observer;

public class WebApp implements Observer {

    private String user;

    public WebApp(String user) {
        this.user = user;
    }

    @Override
    public String update(String title) {
        return user + ": " + title + " from web app.";
    }
}
