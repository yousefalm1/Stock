package com.example.OrderStock.bo;

import com.example.OrderStock.entities.StockEntity;

import java.util.List;

public class AccountResponse {
    private List<StockEntity> stocks;

    public List<StockEntity> getStocks() {
        return stocks;
    }

    public void setStocks(List<StockEntity> stocks) {
        this.stocks = stocks;
    }


    @Override
    public String toString() {
        return "AccountResponse{" +
                "stocks=" + stocks +
                '}';
    }
}
