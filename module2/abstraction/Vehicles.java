package module2.abstraction;

// Abstract class representing general vehicles
// Abstract methods does not have a body and must be implemented by subclasses. abstract methods are declared using the abstract keyword. abstract methods can only exist in abstract classes. abstract classes can have both abstract and concrete methods. 

public abstract class Vehicles {

    public abstract void accelerate();
    public abstract void brake();
    public abstract void honk();
    public abstract void refuel();

    public static void main(String[] args){
        //abstract class cannot be instatiated because it may contain abstract methods that have no implementation. To use an abstract class, you must create a subclass that provides implementations for all abstract methods.
        Vehicles car= new Car();
        Vehicles bike= new Bike();
        car.accelerate();
        car.brake();
        car.honk();
        car.refuel();
        bike.accelerate();
        bike.brake();
        bike.honk();    
        bike.refuel();
    }
    
}
