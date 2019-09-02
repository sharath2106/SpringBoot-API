package com.samplespring.demo.hello;

import com.samplespring.demo.models.Country;
import com.samplespring.demo.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private CountryService countryService;

    @RequestMapping("/get/all")
    public List<Country> returnAllCountries() {
        return countryService.getCountryDetails();
    }

    @GetMapping("/get/iso2code/{alpha2code}")
    public Country returnCountry(@PathVariable("alpha2code") String alpha2code) {
        return countryService.getCountry(alpha2code);
    }

    @PostMapping(path = "/addNewCountry", consumes = "application/json", produces = "application/json")
    public void addNewCountry(@RequestBody Country country) {
        countryService.addCountry(country);
    }
}
