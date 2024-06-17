package com.keyin.Sprint1_API.City;

import com.keyin.Sprint1_API.Airport.Airport;

import java.util.ArrayList;
import java.util.List;

public class City {

    private int city_id;
    private String name;
    private String province;
    private int population;
    private List<Airport> airports;

    public City(int city_id, String name, String province, int population) {
        this.city_id = city_id;
        this.name = name;
        this.province = province;
        this.population = population;
        this.airports = new ArrayList<Airport>();
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }
}
