package com.oop.customerDemo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int width = scanner.nextInt();
        int length = scanner.nextInt();

        Dimension dm = new Dimension(height, width, length);

        Product keyBoard = new Product("Keyboard", 500, 5, 40, dm);

        shoppingCart.addProduct(keyBoard);

        System.out.println(shoppingCart);

        System.out.println("Total Cost = " + shoppingCart.getTotalPrice() + "৳");
    }
}