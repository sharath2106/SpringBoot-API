package com.samplespring.demo.services;


import com.samplespring.demo.error.CountryNotFoundException;
import com.samplespring.demo.models.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CountryService {

    private List<Country> countryDetails = new ArrayList<>(Arrays.asList(
                new Country("India", "IND", "IN"),
                new Country("United Kingdom", "GBP", "GB"),
                new Country("Germany", "GER", "DE"),
                new Country("United States", "US", "US")
        )
    );

    public List<Country> getCountryDetails(){
        return countryDetails;
    }

    public Country getCountry(String alpha2Code){
        return countryDetails.stream().filter(t -> t.getAlpha2Code().equals(alpha2Code)).findFirst().get();
    }

    public void addCountry(Country newCountry) {
         countryDetails.add(newCountry);
    }
}
