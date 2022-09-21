package com.oop.customerDemo;

public class Product {


    //Added after abstraction part
    private static final int SHIPPING_RATE = 5;
    private static final double DIMENSION_CHARGE = 1.5;

    private final String name;
    private int price;
    private int weight;
    private int discount;
    private final Dimension dimension;

    public Product(String name, int price, int discount, int weight, Dimension dimension)
    {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.dimension = dimension;
        this.weight= weight;
    }

    public int getPrice()
    {
        return  price;
    }

    @Override
    public String toString()
    {
        return "\n\tProduct{ \n" +
                "\t\tname = '" + name + '\'' +
                "\n" +
                "\t\tprice = " + price +
                "\n"+
                "\t\tvolume= " + dimension.getVolume()+
                "\n"+
                "\t\tweight = " + weight +
                "\n\t}" ;
    }
}
