package app.Provider;

import app.Product.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductManager {

        private Map<Integer, Product> products = new HashMap<>();
        public ProductManager() {
       products.put(100, new Product("Wallet", 10, 100.0));
       products.put(200, new Product("Pen", 5, 50.0));
       products.put(300, new Product("Bag", 20, 200.0));
       products.put(400, new Product("Notebook", 8, 80.0));
}
        public void displayProducts() {
            System.out.println("List :");
            for (Map.Entry<Integer, Product> entry : products.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue().getName());
            }
        }

        public Product findProductById(int id) {
            return products.get(id);
        }
    }


