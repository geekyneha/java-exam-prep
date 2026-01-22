package module2.abstraction;

public class Car extends Vehicles {
     @Override 
     public void accelerate(){
        System.out.println("Car is accelerating");
     }

        @Override
        public void brake(){
            System.out.println("Car is braking");
        }
    

        @Override
        public void honk(){
            System.out.println("Car is honking");
        }

        @Override
        public void refuel(){
            System.out.println("Car is refueling");
        }
    }