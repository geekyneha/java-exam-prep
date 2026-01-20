package module2.inheritance.hierarchical;

public class Dog extends Animal {
    // own properties and methods   
    private String tailType;
    
    public Dog(String color, int age, String breed){
        this.color = color;
        this.age = age;
        this.breed = breed;
        
    }
    public String getTailType() {
        return tailType;
    }
    public void setTailType(String tailType) {
        this.tailType = tailType;
    }
    @Override
    public void sleep(){
        // specific hour for dog
        System.out.println("Dog sleeps for 12 hours");
    }
    @Override 
    public void makeSound(){
        System.out.println("Dog barks");
    }

    public void fetch(){
        System.out.println("Dog fetches the ball");
    }
    public void displayInfo(){
        System.out.println("Dog Info: Color - " + color + ", Age - " + age + ", Breed - " + breed + ", Tail Type - " + tailType);
    }
    
}
