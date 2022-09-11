//Usage of "Final" keyword

package com.oop.customerDemo;

public class CreditCard {
    private final long num;
    private final int cvv;
    private final String validThrough;

    public CreditCard(long num, int cvv, String validThrough)
    {
        this.num = num;
        this.cvv = cvv;
        this.validThrough = validThrough;
    }
}
