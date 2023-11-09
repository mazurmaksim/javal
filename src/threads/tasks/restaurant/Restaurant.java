package threads.tasks.restaurant;

//Task: Restaurant with a Waiter
//
//        Imagine you have a restaurant with one waiter and several customers. The waiter can serve
//        only one customer at a time.
//        Customers need to wait until the waiter is available to place their food orders.
//
//        Your task is to create two classes: Waiter and Customer.
//
//        The Waiter class represents the waiter and has a method serveFood that should be called when the waiter
//        is ready to take an order from a customer.
//
//        The Customer class represents a restaurant customer and has a method placeOrder that is called
//        when a customer wants to order food. The customer should wait if the waiter is busy, and when the waiter
//        becomes available, they can place their order.
//
//        Use the wait and notify mechanisms for synchronization between the waiter and the customers to ensure
//        that they can correctly wait and place their orders.

import java.util.HashMap;
import java.util.List;

public class Restaurant {

    public static void main(String[] args) {
        Object sharedObject = new Object();

        Customer cs1 = new Customer(sharedObject,1, List.of("Tea", "Coffee", "Stakes"));
        Customer cs2 = new Customer(sharedObject,2, List.of("Capuccino", "Pasta", "Fish"));
        Customer cs3 = new Customer(sharedObject,3, List.of("Proseko", "Fanta", "Cola"));
        Customer cs4 = new Customer(sharedObject,4, List.of("Picca", "Hamburger", "Soda"));

        Waiter wt = new Waiter(sharedObject);
        Thread customer1 = new Thread(cs1::placeOrder);
        Thread customer2 = new Thread(cs2::placeOrder);
        Thread customer3 = new Thread(cs3::placeOrder);
        Thread customer4 = new Thread(cs4::placeOrder);
        Thread waiter = new Thread(wt::serveFood);

        waiter.start();
        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();

    }
}
