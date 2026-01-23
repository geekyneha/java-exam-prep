package module2.abstraction;

public class Bike  extends Vehicles {
    @Override 
    public void accelerate(){
       System.out.println("Bike is accelerating");
    }

       @Override
       public void brake(){
           System.out.println("Bike is braking");
       }
   

       @Override
       public void honk(){
           System.out.println("Bike is honking");
       }

       @Override
       public void refuel(){
           System.out.println("Bike is refuled");
       }
    
}
