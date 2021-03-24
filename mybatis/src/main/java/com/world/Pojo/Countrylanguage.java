package com.world.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Countrylanguage {
    private String CountryCode;
    private String Language;
    private String IsOfficial;
    private Double Percentage;
}
