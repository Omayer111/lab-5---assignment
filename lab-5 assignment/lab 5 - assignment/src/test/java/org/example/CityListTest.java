package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CityListTest {
    private CityList ctlist = new CityList();

    private City city1  =new City("kadamtali","sylhet");
    private City city2  =new City("sonadanga","Khulna");


    @Test
    public void testDelete() {
        ctlist.add(city1);
        ctlist.add(city2);
        ctlist.delete(city1);
        List<City> newCities = ctlist.getCities();
        assertEquals(1,newCities.size());
        assertEquals(city2,newCities.get(0));

    }

    @Test
    public void testDeleteException() {
        ctlist.add(city1);
        ctlist.add(city2);
        assertThrows(IllegalArgumentException.class, () -> ctlist.delete(new City("subidbazar","sylhet")));
    }

    @Test
    public void testCount() {
        ctlist.add(city1);
        ctlist.add(city2);
        assertEquals(2, ctlist.count());
    }

    @Test
    public void testSort() {
        ctlist.add(city1);
        ctlist.add(city2);
        List<City> cities = ctlist.getCities();
        assertEquals(city1,cities.get(0));
        assertEquals(city2,cities.get(1));
    }
}
