package Stocks.Impl;

import Stocks.Observer;
import Stocks.StockInterface;

import java.util.ArrayList;
import java.util.HashMap;

public class StockMarket implements StockInterface {

    HashMap<String, ArrayList<Observer>> observerlist;

    public StockMarket() {
        observerlist = new HashMap<String, ArrayList<Observer>>();
    }

    @Override
    public void register(Observer observer, String stock) {
        this.observerlist.putIfAbsent(stock, new ArrayList<Observer>());
        this.observerlist.get(stock).add(observer);
    }

    @Override
    public void deregister(Observer observer, String stock) {
        this.observerlist.get(stock).remove(observer);
    }

    @Override
    public void notifyObservers(String title, String stock) {
        ArrayList<Observer> observers = observerlist.get(stock);
        for(Observer observer: observers) {
            System.out.println(observer.update(title));
        }
    }
}
