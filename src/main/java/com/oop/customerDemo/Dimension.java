package com.oop.customerDemo;

public class Dimension {
    private final double Height;
    private final double Length;
    private final double Width;

    public Dimension(int height, int width, int length)
    {
        Height = height;
        Width = width;
        Length = length;
    }

    public double getVolume ()
    {
        return Height * Width * Length;
    }
}
