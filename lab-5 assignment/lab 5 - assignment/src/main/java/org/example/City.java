package org.example;

import java.util.Comparator;

/**
 * Represents a city with its name and province.
 */
public class City {
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String showCity(){
        return this.city;
    }

    String showProvince(){
        return this.province;
    }

}

class sortByCity implements Comparator<City> {
    public int compare(City a, City b){return a.showCity().compareTo(b.showCity());}
}
