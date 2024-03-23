package fr.upec.episen;

import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class CarDealerIT {

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
