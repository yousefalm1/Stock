package com.example.Account.controllers;


import com.example.Account.bo.AccountResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class StockController {

    private final RestTemplate restTemplate;

    private static final String ACCOUNT_API = "http://localhost:8080/api/account";


    public StockController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @GetMapping("/account")
    public AccountResponse showStocks(){

        ResponseEntity<AccountResponse> responseEntity = restTemplate.getForEntity(ACCOUNT_API, AccountResponse.class);

        AccountResponse accountStatus = responseEntity.getBody();

        System.out.println("Account Status: " + accountStatus);

        return accountStatus;
    }
}
