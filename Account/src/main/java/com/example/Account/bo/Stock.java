package com.example.Account.bo;

public class Stock {

    private String item;
    private int remainingQuantity;

    public Stock(String item, int remainingQuantity) {
        this.item = item;
        this.remainingQuantity = remainingQuantity;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity(int remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "item='" + item + '\'' +
                ", remainingQuantity=" + remainingQuantity +
                '}';
    }
}
