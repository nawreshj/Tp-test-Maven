package fr.upec.episen;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNull;


public class CarDealerTU {

    @Test 
    public void IsListEmpty (){
        // Given 
        ArrayList<Car> cars= new ArrayList<Car>();
        CarDealer carDealer= new CarDealer();
        //When 
        cars= carDealer.Order(3, "Jaune");
        //Then 
        assertNull(cars);

    }

    
    
}
