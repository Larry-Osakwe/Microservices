package com.practice.microservices.currencyexchangeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @GetMapping("/currency-exchange/from/USD/to/INR")
    public CurrencyExchange retrieveExchangeValue() {
        CurrencyExchange currencyExchange = new CurrencyExchange();

        return currencyExchange;
    }


}
