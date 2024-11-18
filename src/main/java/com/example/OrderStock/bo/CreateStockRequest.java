package com.example.OrderStock.bo;


public class CreateStockRequest {

    private Long quantity;

    private String item;

    public int getQuantity() {
        return Math.toIntExact(quantity);
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}