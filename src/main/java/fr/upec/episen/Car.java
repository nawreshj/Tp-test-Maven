package fr.upec.episen;


public class Car {
     String color;

    public String getColor() {
        return color;
    }

    public Car (String clr){
        if ( clr==null){
            this.color="Rouge";  
        }else this.color=clr;
    }

    public void build(String couleur) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'build'");
    }
}
