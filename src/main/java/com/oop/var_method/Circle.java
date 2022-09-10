package com.oop.var_method;

public class Circle {
    public static final double PI = 3.14159;
    private int numOfObj = 0;
    private int radius;

    public Circle(int radius)
    {
        this.radius = radius;
        numOfObj++;
    }

    public int getNumOfObj()
    {
        return numOfObj;
    }

    public double getArea()
    {
        return  radius * radius * PI;
    }
}
