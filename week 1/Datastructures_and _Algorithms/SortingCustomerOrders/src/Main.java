import Model.IOrder;
import Repo.IOrderRepo;
import Repo.Impl.OrderRepo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IOrderRepo repo = new OrderRepo();
        repo.addOrder("Order1", "Abhi", 501.10);
        repo.addOrder("Order1", "Shek", 401.10);
        repo.addOrder("Order1", "Abdul", 301.10);
        repo.addOrder("Order1", "Sajan", 201.10);
        repo.addOrder("Order1", "Mat", 101.10);
        ArrayList<IOrder> bubbleSorted = repo.bubbleSort();
        for(IOrder order: bubbleSorted) {
            System.out.println("------------------------------");
            System.out.print("Order ID: " + order.getId() + "\nCustomer name: " + order.getCustomerName() + "\nTotal Price: " + order.getTotalPrice());
            System.out.print("\n------------------------------");
            System.out.println();
        }
        ArrayList<IOrder> quickSorted = repo.quickSort();
        for(IOrder order: quickSorted) {
            System.out.println("------------------------------");
            System.out.print("Order ID: " + order.getId() + "\nCustomer name: " + order.getCustomerName() + "\nTotal Price: " + order.getTotalPrice());
            System.out.print("\n------------------------------");
            System.out.println();
        }
    }
}