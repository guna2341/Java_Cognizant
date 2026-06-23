package Repo.Impl;

import Model.IOrder;
import Model.Impl.Order;
import Repo.IOrderRepo;

import java.util.ArrayList;

public class OrderRepo implements IOrderRepo {

    ArrayList<IOrder> orders;

    public OrderRepo() {
        orders = new ArrayList<IOrder>();
    }

    @Override
    public void addOrder(String id, String name, double price) {
        IOrder order = new Order(id, name, price);
        orders.add(order);
    }

    @Override
    public ArrayList<IOrder> bubbleSort() {
        ArrayList<IOrder> tempOrders = new ArrayList<IOrder>(orders);
        for(int i=0;i<tempOrders.size() - 1;i++) {
            for(int j = 0;j<tempOrders.size() - i - 1;j++) {
                if (tempOrders.get(j).getTotalPrice() > tempOrders.get(j+1).getTotalPrice()) {
                    IOrder order = tempOrders.get(j);
                    tempOrders.set(j, tempOrders.get(j + 1));
                    tempOrders.set(j + 1, order);
                }
            }
        }
        return tempOrders;
    }

    @Override
    public ArrayList<IOrder> quickSort() {
        ArrayList<IOrder> list = new ArrayList<IOrder>(orders);
        quick(list,0, list.size() - 1);
        return list;
    }

    public void quick(ArrayList<IOrder> list, int srt, int end) {
        if (srt >= end) return;
        int h = srt;
        int mid = srt + (end - srt) / 2;
        double pivot = list.get(mid).getTotalPrice();
        int e = end;
        while (h <= e) {
            while (h <= end && list.get(h).getTotalPrice() <= pivot) {
                h++;
            }
            while (e >= srt && list.get(e).getTotalPrice() >= pivot) {
                e--;
            }
            if (h <= e) {
                IOrder order = list.get(e);
                list.set(e, list.get(h));
                list.set(h, order);
                h++;
                e--;
            }
        }
        quick(list, srt, e);
        quick(list, h, end);
    }
}
