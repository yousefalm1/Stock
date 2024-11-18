package com.example.OrderStock.servicies;


import com.example.OrderStock.bo.CreateStockRequest;
import com.example.OrderStock.bo.UpdateStockResponse;
import com.example.OrderStock.entities.StockEntity;

import java.util.List;

public interface StockService {

    UpdateStockResponse updateStock(CreateStockRequest request);

    void addItems(CreateStockRequest stock);

    List<StockEntity> getStocks();


}