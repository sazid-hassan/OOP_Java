package com.oop.customerDemo;

public class Customer {

    private String name;

    private CreditCard creditCard;

    public Customer(String name, long num, int cvv, String validThrough)
    {
        this.name = name;
        this.creditCard = new CreditCard(num, cvv, validThrough);
    }

    public Customer(String name, CreditCard creditCard)
    {
        this.name = name;
        this.creditCard = creditCard;
    }
}
