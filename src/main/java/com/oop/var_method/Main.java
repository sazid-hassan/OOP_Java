package com.oop.var_method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int radius =  scanner.nextInt();

        Circle c1 = new Circle(radius);

        System.out.println("C1 area : " + c1.getArea());
    }
}
