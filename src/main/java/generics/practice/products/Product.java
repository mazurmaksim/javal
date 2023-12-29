package generics.practice.products;

// Створіть систему зберігання продуктів, яка використовує Generics для забезпечення універсальності.
// Вам потрібно створити клас Store, який може зберігати будь-який тип продукту.
// Створіть клас Product з полями name (назва продукту) та price (ціна продукту).
// Створіть клас Store<T>, де T - це тип продукту, який може зберігати склад.
// Реалізуйте методи в класі Store, такі як addProduct, getProduct, removeProduct, і т. д.,
// які дозволяють додавати, отримувати та видаляти продукти зі складу.
// Переконайтеся, що ваша система дозволяє зберігати будь-який тип продукту, наприклад,
// Store<Product>, Store<String>, Store<Integer>, і т. д.
// Створіть приклад використання вашої системи, додавши декілька продуктів різних типів
// до складу та виведіть їх інформацію на екран.
public class Product {
    String name;
    Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
