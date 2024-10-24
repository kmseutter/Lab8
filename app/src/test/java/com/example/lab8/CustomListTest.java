package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


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
        list.add(newCity);
        int afterAdd = beforeAdd+1;
        assertEquals(list.getCount(), afterAdd, "City wasn't added");
    }
}
