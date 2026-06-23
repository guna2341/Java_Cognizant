package Repo;

import Model.IOrder;

import java.util.ArrayList;

public interface IOrderRepo {

    void addOrder(String id, String name, double price);

    ArrayList<IOrder> bubbleSort();

    ArrayList<IOrder> quickSort();

}
