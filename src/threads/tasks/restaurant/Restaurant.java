package threads.tasks.restaurant;

//        You are developing an order management system for a restaurant. The restaurant consists of a kitchen where
//        food is prepared and serving staff that takes orders from customers.
//
//        Create a class called Order that contains information about the order:
//        order number, a list of dishes, and status (completed or pending).
//
//        Create a class called Dish that contains information about a dish:
//        name, ingredients, and preparation time.
//
//        Create a class called Chef to represent the kitchen of the restaurant.
//        Each Chef should be implemented as a thread. Each Chef should take orders
//        and prepare dishes according to their preparation time. After completing
//        the preparation, each dish should be marked as ready.
//
//        Create a class called Waiter to represent the serving staff of the restaurant.
//        The Waiter should be implemented as a thread. Waiters should take orders from
//        customers and pass them to the kitchen. After the Chef completes the order,
//        the Waiter should deliver it to the customer.
//
//        Create a class called Restaurant that uses threads for the kitchen and serving
//        staff. The Restaurant should take orders from customers and distribute them among
//        the waiters. Waiters should pass the orders to the Chefs for preparation.
//        When the Chef finishes preparing a dish, the Waiter should deliver the order to the customer.

import java.util.Arrays;

public class Restaurant {

    public static void main(String[] args) {
        Customer customer1 = new Customer(1, Arrays.asList(new ChickenCurry(), new SalmonSushi(), new MargaritaPica()));
        Customer customer2 = new Customer(8, Arrays.asList(new ChickenCurry(), new MargaritaPica()));
        Customer customer3 = new Customer(5, Arrays.asList(new ChickenCurry(), new MargaritaPica(), new MargaritaPica()));
    }
}
