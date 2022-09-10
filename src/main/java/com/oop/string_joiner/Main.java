package com.oop.string_joiner;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        String[] cities = {"Dhaka", "Chittagong", "Sylhet"};

        StringJoiner joiner = new StringJoiner(", ");

        for (String city : cities)
        {
            joiner.add(city);
        }

        System.out.println(joiner);
    }
}
