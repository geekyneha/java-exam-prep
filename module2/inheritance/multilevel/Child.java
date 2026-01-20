package module2.inheritance.multilevel;

public class Child extends Parent{
    public String name;
    public Child(String name){
        this.name = name;
    }
    

    public static void main(String[] args){
        Child child = new Child("Harry");
        System.out.println("Child Name: " + child.name);
        System.out.println("Child SurName: " + child.surName);
        child.displayInfo();
    }
    
}
