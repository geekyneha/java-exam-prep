package module2.inheritance.hierarchical;

public class Main {
    public static void main(String args[]){
        Dog dog = new Dog("Brown",4,"Labrador");
        dog.setTailType("Long");

        Cat cat = new Cat( "White", 2 , "Persian");
        cat.setFurPattern("Striped");

        Horse horse = new Horse ("Black", 5, "Arabian");
        horse.setManeColor("Black");
        Horse horse2 = new Horse("Black", 3 , "Mustang");
        horse2.setManeColor("Brown");

        dog.displayInfo();
        cat.displayInfo();
        horse.displayInfo();
        horse2.displayInfo();
    }
    
}
