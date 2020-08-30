package com.in28minutes.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange-service", url = "http://localhost:8000")
public interface CurrencyExchangeServiceProxy {

  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from,
      @PathVariable("to") String to);

}