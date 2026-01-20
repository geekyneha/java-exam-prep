package module2.inheritance.hierarchical;

public class Cat extends Animal {
     // own properties and methods
     private String furPattern;


    public Cat(String color, int age, String breed){
        this.color = color;
        this.age = age;
        this.breed = breed;
    }
    public String getFurPattern() {
        return furPattern;
    }
    public void setFurPattern(String furPattern) {
        this.furPattern = furPattern;
    }

    @Override
    public void makeSound(){
        System.out.println("Cat meows");
    }
    @Override 
    public void sleep(){
        System.out.println("Cat sleeps for 16 hours");
    }

    public void scratch(){
        System.out.println("Cat scratches furniture");
    }
    public void displayInfo(){
        System.out.println("Cat Info: Color - " + color + ", Age - " + age + ", Breed - " + breed + ", Fur Pattern - " + furPattern);
    }

}
