package com.example.OrderStock.repositories;

import com.example.OrderStock.entities.StockEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StockRepository extends CrudRepository<StockEntity, Long> {

    Iterable<StockEntity> findByItem(String item);

    List<StockEntity> findAll();

}