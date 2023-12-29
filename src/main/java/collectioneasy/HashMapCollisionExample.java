package main.java.collectioneasy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapCollisionExample {
    public static void main(String[] args) {
        // Створення HashMap

        Map<CustomKey, String> hashMap = new HashMap<>();

        // Створення двох ключів, які мають однаковий хеш-код
        CustomKey key1 = new CustomKey("key1");
        CustomKey key2 = new CustomKey("key2");

        // Додавання значень до HashMap
        hashMap.put(key1, "Значення для ключа 1");
        hashMap.put(key2, "Значення для ключа 2");

        // Отримання значень за ключами
        String value1 = hashMap.get(key1);
        String value2 = hashMap.get(key2);

        // Вивід результатів
        System.out.println("Значення для ключа 1: " + value1);
        System.out.println("Значення для ключа 2: " + value2);
    }
}

class CustomKey {
    private String key;

    public CustomKey(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        // Повертаємо один і той самий хеш-код для обох ключів
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        CustomKey other = (CustomKey) obj;
        return key.equals(other.key);
    }
}