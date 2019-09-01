package com.samplespring.demo.error;

public class CountryNotFoundException extends RuntimeException {

    public CountryNotFoundException(String countryName) {
        super("Country not found : " + countryName);
    }


}
