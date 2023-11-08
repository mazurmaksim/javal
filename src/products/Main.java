package products;

public class Main {
    public static void main(String[] args) {
        Alcohol valentine = new Alcohol("Valentine", 15.0);
        Store<Product> store = new Store<>();
        store.addProduct(valentine);
        Fruits apple = new Fruits("Apple", 2.0);
        store.addProduct(apple);
        System.out.print(store.getProduct(apple));
        store.removeProduct(apple);
        System.out.print(store.getProduct(apple));
    }
}
