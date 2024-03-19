package fr.upec.episen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CarFactoryTest {

    @Test
    public void ColorisValid() throws CarColorException{
        //Given 
        String color= "Rouge";
        CarFactory carFactory= new CarFactory();
        Car car;

        //When 
        car= carFactory.build(color);

        //Then 
        assertEquals(car.getColor(), color);
    }

    @Test
    public void IfColorIsNull() throws CarColorException{
        //Given
        CarFactory carFactory= new CarFactory();
        Car car;

        //When 
        car= carFactory.build(null);

        //Then 
        assertEquals(car.getColor(), "Rouge");

    }
    
}
