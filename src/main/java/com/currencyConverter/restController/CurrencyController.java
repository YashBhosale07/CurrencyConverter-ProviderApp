package com.currencyConverter.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.currencyConverter.model.CurrencyResponse;

@RestController
@RequestMapping("/currencyConverter")
public class CurrencyController {
	
	@GetMapping("/getCurrencyConverterExchange/{from}/{to}")
	public ResponseEntity<CurrencyResponse>converter(@PathVariable String from,@PathVariable String to){
		CurrencyResponse currencyResponse=new CurrencyResponse();
		currencyResponse.setCurrencyId(1);
		currencyResponse.setCurrencyFrom(from);
		currencyResponse.setCurrencyTo(to);
		currencyResponse.setCurrencyValue(82.0);
		return new ResponseEntity<CurrencyResponse>(currencyResponse,HttpStatus.OK);
	}
	
	@GetMapping("/getCurrencyConverterExchangeUsingRequestParam")
	public ResponseEntity<CurrencyResponse> converterRequestParam(@RequestParam String from, @RequestParam String to) {
	    CurrencyResponse currencyResponse = new CurrencyResponse();
	    currencyResponse.setCurrencyId(1);
	    currencyResponse.setCurrencyFrom(from);
	    currencyResponse.setCurrencyTo(to);
	    currencyResponse.setCurrencyValue(82.0);
	    return new ResponseEntity<>(currencyResponse, HttpStatus.OK);
	}

	
}

