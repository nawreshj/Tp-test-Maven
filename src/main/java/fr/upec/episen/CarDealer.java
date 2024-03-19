package fr.upec.episen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CarDealer {

    public ArrayList<Car> Order(int qtite, String color){
        int compteur= qtite;
        CarFactory carFactory= new CarFactory();
         ArrayList<Car> cars= new ArrayList<>();
        
            
    

         try {
            // Ajoute les voitures à la liste en utilisant CarFactory.build
            for (int i = 0; i < qtite; i++) {
                Car car = carFactory.build(color);
                cars.add(car);
            }
        } catch (CarColorException e) {
            // En cas d'exception, retourne null
            return null;
        }
        
        // Retourne la liste de voitures
        return cars;
        
    }

    
    
}
