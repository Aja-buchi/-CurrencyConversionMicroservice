package controller;

import model.CurrencyConversion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {
    @GetMapping("/currency-conversion/from/{from}/to/{to}/{quantity}")
    public CurrencyConversion calculateCurrencyConversion(){
    return ;
    }
}
