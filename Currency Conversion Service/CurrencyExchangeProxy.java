package com.example.microservices.currency_conversion_service.currencyconversion;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-exchange-service", url="localhost:8000")
@FeignClient(name = "currency-exchange-server")
public interface CurrencyExchangeProxy {


    @GetMapping("/currency-exchange-service/from/{from}/to/{to}")
    public CurrencyConversion retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to);
}
