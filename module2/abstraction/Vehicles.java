package module2.abstraction;

// Abstract class representing general vehicles
// Abstract methods does not have a body and must be implemented by subclasses. abstract methods are declared using the abstract keyword. abstract methods can only exist in abstract classes. abstract classes can have both abstract and concrete methods. 

public abstract class Vehicles {
        // Contructor of abstract class must be protected because they are only called when a subclass is instantiated. so there is no point in having a public constructor for an abstract class. private constructor is not allowed in abstract class because it prevents subclass from calling the constructor of the abstract class.
        protected Vehicles(){
        System.out.println("Vehicle is created");
    }
    //Abstract methods are meant to be overriden in subclasses. public access modifier allows the methods to be accessed by any a non-subclass which is not ideal for abstract class methods. protected access modifier allows the methods to be accessed only within the same package or by subclasses which is more appropriate for abstract class methods.
    protected abstract void accelerate();
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
