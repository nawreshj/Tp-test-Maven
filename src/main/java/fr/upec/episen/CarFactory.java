package fr.upec.episen;

public class CarFactory {

    public Car build(String color)throws CarColorException{
        
            if(color=="Rouge" || color=="Vert" ||color=="Bleu" ||color==null  ){
            Car car= new Car(color);
            return car;
            }
            else  throw new CarColorException("Couleur de voiture invalide : " + color);

       
        
        
    

    
}
}
