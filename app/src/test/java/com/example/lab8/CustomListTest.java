package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    //private CustomList list;

    public CustomList MockCityList(){
        CustomList list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        CustomList list = MockCityList();
        int beforeAdd = list.getCount();
        assertEquals(beforeAdd, list.getCount(), "Count should be 0");

        City newCity = new City("Estevan", "SK");
        list.addCity(newCity);
        int afterAdd = beforeAdd+1;
        assertEquals(list.getCount(), afterAdd, "City wasn't added");
    }

    @Test
    public void hasCityTest(){
        CustomList list = MockCityList();
        City newCity = new City("Estevan", "SK");
        list.addCity(newCity);
        assertTrue(list.hasCity(newCity), "City not in list");
    }

    @Test
    public void deleteCityTest(){
        CustomList list = MockCityList();
        City newCity = new City("Estevan", "SK");
        list.addCity(newCity);
        list.deleteCity(newCity);
        assertEquals(list.getCount(), 0, "City wasn't deleted");
    }

    @Test
    public void countCities(){
        CustomList list = MockCityList();
        City newCity1 = new City("Estevan", "SK");
        City newCity2 = new City("Edmonton", "AB");
        list.addCity(newCity1);
        list.addCity(newCity2);
        assertEquals(list.countCities(), 2, "City count is wrong");
    }
}
