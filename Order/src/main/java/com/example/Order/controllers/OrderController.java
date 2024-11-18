package com.example.Order.controllers;


import com.example.Order.bo.CreateOrderRequest;
import com.example.Order.bo.OrderResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class OrderController {

    private final RestTemplate restTemplate;

    private static final String STOCK_API = "http://localhost:8080/api/updateStock";

    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @PostMapping("/orders")
    public OrderResponse doOrder(@RequestBody CreateOrderRequest customerOrder) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<CreateOrderRequest> request = new HttpEntity<>(customerOrder, headers);

        ResponseEntity<OrderResponse> responseEntity = restTemplate.postForEntity(STOCK_API, request, OrderResponse.class);
        OrderResponse orderStatus = responseEntity.getBody();

        System.out.println("Order Status::" + orderStatus);

        return orderStatus;
    }
}