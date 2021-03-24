package com.zqw.pojo;

public class Country {
    private double SurfaceArea;
    private String Region;
    private int Population;
    private String Name;
    private String LocalName;
    private double LifeExpectancy;
    private int IndepYear;
    private String HeadOfState;
    private String Code2;
    private String GovernmentForm;
    private double GNPOld;
    private double GNP;
    private String Continent;
    private int Capital;
    private String Code;

    public Country() {
    }

    public Country(double surfaceArea, String region, int population, String name, String localName, double lifeExpectancy, int indepYear, String headOfState, String governmentForm, double GNPOld, double GNP, String continent, String code2, String code, int capital) {
        SurfaceArea = surfaceArea;
        Region = region;
        Population = population;
        Name = name;
        LocalName = localName;
        LifeExpectancy = lifeExpectancy;
        IndepYear = indepYear;
        HeadOfState = headOfState;
        GovernmentForm = governmentForm;
        this.GNPOld = GNPOld;
        this.GNP = GNP;
        Continent = continent;
        Code2 = code2;
        Code = code;
        Capital = capital;
    }

    public double getSurfaceArea() {
        return SurfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        SurfaceArea = surfaceArea;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocalName() {
        return LocalName;
    }

    public void setLocalName(String localName) {
        LocalName = localName;
    }

    public double getLifeExpectancy() {
        return LifeExpectancy;
    }

    public void setLifeExpectancy(double lifeExpectancy) {
        LifeExpectancy = lifeExpectancy;
    }

    public int getIndepYear() {
        return IndepYear;
    }

    public void setIndepYear(int indepYear) {
        IndepYear = indepYear;
    }

    public String getHeadOfState() {
        return HeadOfState;
    }

    public void setHeadOfState(String headOfState) {
        HeadOfState = headOfState;
    }

    public String getGovernmentForm() {
        return GovernmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        GovernmentForm = governmentForm;
    }

    public double getGNPOld() {
        return GNPOld;
    }

    public void setGNPOld(double GNPOld) {
        this.GNPOld = GNPOld;
    }

    public double getGNP() {
        return GNP;
    }

    public void setGNP(double GNP) {
        this.GNP = GNP;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public String getCode2() {
        return Code2;
    }

    public void setCode2(String code2) {
        Code2 = code2;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }
                                                          
    public int getCapital() {
        return Capital;
    }

    public void setCapital(int capital) {
        Capital = capital;
    }

    @Override
    public String toString() {
        return "Country{" +
                "SurfaceArea=" + SurfaceArea +
                ", Region='" + Region + '\'' +
                ", Population=" + Population +
                ", Name='" + Name + '\'' +
                ", LocalName='" + LocalName + '\'' +
                ", LifeExpectancy=" + LifeExpectancy +
                ", IndepYear=" + IndepYear +
                ", HeadOfState='" + HeadOfState + '\'' +
                ", Code2='" + Code2 + '\'' +
                ", GovernmentForm='" + GovernmentForm + '\'' +
                ", GNPOld=" + GNPOld +
                ", GNP=" + GNP +
                ", Continent='" + Continent + '\'' +
                ", Capital=" + Capital +
                ", Code='" + Code + '\'' +
                '}';
    }
}
