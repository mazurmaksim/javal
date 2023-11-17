package threads.tasks.restaurant;

import java.util.List;

//        Order that contains information about the order:
//        order number, a list of dishes, and status (completed or pending).
public class Order {
    String orderId;
    List<Dish> dishes;

    public Order(String orderId, List<Dish> dishes) {
        this.orderId = orderId;
        this.dishes = dishes;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
