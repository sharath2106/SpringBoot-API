package com.samplespring.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Country {

    @JsonProperty
    private String countryName;

    @JsonProperty
    private String alpha2Code;

    @JsonProperty
    private String alpha3Code;
}
