package module2;

public class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dog barks");
    }
    public static void main(String[] args){
        Dog bullDog= new Dog();
        bullDog.makeSound();
        bullDog.setName("Buddy");
        bullDog.setAge(3);
        System.out.println("Dog's Name: " + bullDog.getName());
        System.out.println("Dog's Age: " + bullDog.getAge());
    }
    
}
