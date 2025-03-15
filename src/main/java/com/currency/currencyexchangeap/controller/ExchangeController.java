package com.currency.currencyexchangeap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class ExchangeController {

    @GetMapping("/moneydetails")
    public  String getMoney(){
        return "Money found is 500";
    }
}
