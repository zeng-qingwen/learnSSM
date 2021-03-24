package com.zqw.pojo;

public class City {
    private int ID;
    private String Name;
    private String CountryCode;
    private String District;
    private int Poplulation;

    public City(int ID, String name, String countryCode, String district, int poplulation) {
        this.ID = ID;
        Name = name;
        CountryCode = countryCode;
        District = district;
        Poplulation = poplulation;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    @Override
    public String toString() {
        return "City{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", CountryCode='" + CountryCode + '\'' +
                ", District='" + District + '\'' +
                ", Poplulation=" + Poplulation +
                '}';
    }

    public void setDistrict(String district) {
        District = district;
    }

    public void setPoplulation(int poplulation) {
        Poplulation = poplulation;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public String getDistrict() {
        return District;
    }

    public int getPoplulation() {
        return Poplulation;
    }
}
