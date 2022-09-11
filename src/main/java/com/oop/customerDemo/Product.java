package com.oop.customerDemo;

public class Product {
    private final String name;
    private int price;

    public Product(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    public int getPrice()
    {
        return  this.price;
    }

    @Override
    public String toString()
    {
        return "\nProduct{ \n" +
                "\tname = '" + name + '\'' +
                "\n" +
                "\tprice = " + price +
                '}' ;
    }
}
