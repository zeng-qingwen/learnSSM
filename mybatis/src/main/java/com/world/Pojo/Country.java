package com.world.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {
    private String Code;
    private String Name;
    private String Continent;
    private String Region;
    private Double SurfaceArea;
    private int IndepYear;
    private int Population;
    private Double LifeExpectancy;
    private Double GNP;
    private Double GNPOld;
    private String LocalName;
    private String GovernmentForm;
    private String HeadOfState;
    private int Capital;
    private String Code2;
}
