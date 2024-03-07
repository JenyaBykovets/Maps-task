package app;

import app.Product.Product;
import app.Provider.ProductManager;

import java.util.Scanner;

public class Main {
    private static ProductManager productManager = new ProductManager();

    public static void main(String[] args) {
        productManager.displayProducts();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID : ");
        int id = scanner.nextInt();

        Product foundProduct = productManager.findProductById(id);
        if (foundProduct != null) {
            getOutput(foundProduct);
        } else {
            System.out.println("---------");
        }
    }

    public static void getOutput(Product product) {
        System.out.println("Result :");
        System.out.println("Name : " + product.getName() + ", Quantity: " + product.getQuantity() +
                ", Price: " + product.getPrice());
    }
}







