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

    public Country getCountry(String alpha2code){
        return countryDetails.stream().filter(t -> t.getAlpha2Code().equals(alpha2code)).findFirst().get();
    }

    public void addCountry(Country newCountry) {
         countryDetails.add(newCountry);
    }

//    public void updateCountry(Country country, String id) {
//        for(int i = 0; i< countryDetails.size(); i++){
//            Country stud = countryDetails.get(i);
//            if(stud.getCountryName().equals(id)){
//                countryDetails.set(i, country);
//                return;
//            }
//        }
//    }
//
//    public void deleteCountry(String id) {
//        countryDetails.removeIf(t -> t.getCountryName().equals(id));
//    }
}
