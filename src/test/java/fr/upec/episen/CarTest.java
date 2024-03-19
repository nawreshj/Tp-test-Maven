package fr.upec.episen;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void isColorByDefautRouge(){
        //Given When

        Car car = new Car(null);

        //then 

        assertEquals(car.getColor(), "Rouge");

    }

    @Test
    public void isCorrectColor(){
        //given
        String color="Jaune";

        //When 
        Car car = new Car(color);

        //Then 
        assertEquals(color, car.getColor());
    }

    
    
}
