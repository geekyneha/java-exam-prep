package module2.inheritance.single;

public class Dog extends Animal{
   public String breed;
    public Dog(String breed) {
        this.breed = breed;
    }
    public void makeSound(){
        System.out.println("Dog barks");
    }
    public static void main(String[] args) {
        Dog dog = new Dog("Labrador");
        dog.setName("Bob");
        dog.setAge(3);
        System.out.println("Dog Name: " + dog.getName());
        System.out.println("Dog Age: " + dog.getAge());
        System.out.println("Dog Breed: " + dog.breed);
        dog.makeSound();
    }

}