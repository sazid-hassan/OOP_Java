package com.oop.customerDemo;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product keyBoard = new Product("Keyboard", 500);
        Product mouse = new Product("Mouse", 400);
        Product hub = new Product("Hub", 300);

        shoppingCart.addProduct(keyBoard);
        shoppingCart.addProduct(mouse);
        shoppingCart.addProduct(hub);

        System.out.println(shoppingCart);

        System.out.println("Total Cost = " + shoppingCart.getTotalPrice() + "৳");
    }
}