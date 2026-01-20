package module2.inheritance.hierarchical;

public class Horse extends Animal{
    // own properties and methods
    private String maneColor;
    
    public Horse(String color, int age, String breed){
        this.color = color;
        this.age = age;
        this.breed = breed;
        
    }

    public String getManeColor() {
        return maneColor;
    }
    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }
    
    @Override
    public void sleep(){
        // specific hour for horse
        System.out.println("Horse sleeps for 8 hours");
    }
    @Override 
    public void makeSound(){
        System.out.println("Horse neighs");
    }
    public void gallop(){
        System.out.println("Horse gallops");
    }
   
    public void displayInfo(){
        System.out.println("Horse Info: Color - " + color + ", Age - " + age + ", Breed - " + breed + ", Mane Color - " + maneColor);
    }
    
}
