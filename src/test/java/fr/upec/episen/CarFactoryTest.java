package fr.upec.episen;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarFactoryTest {

    private Car carMock;



    @Test
    public void ColorisValid() throws CarColorException {
        // Given
        String color = "Rouge";
        CarFactory carFactory = new CarFactory();
        carMock = Mockito.mock(Car.class);
        Mockito.when(carMock.getColor()).thenReturn(color);

        // When
        Car car = carFactory.build(null); // Utilisez n'importe quelle couleur ici, car le mock est configuré pour retourner 'color'

        // Then
        assertEquals(color, car.getColor());
    }


    @Disabled
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
