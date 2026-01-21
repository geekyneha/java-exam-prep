package module2.inheritance.multilevel;

public class Child extends Parent{
    public String name;
    public Child(String name){
        this.name = name;
    }
    

    public static void main(String[] args){
        Child child = new Child("Harry");
        Child child2 = new Child("Ginny");
        System.out.println("Child Name: " + child.name);
        System.out.println("Child SurName: " + child.surName);
        child.displayInfo();
        System.out.println("Child Name: " + child2.name);
        System.out.println("Child SurName: " + child2.surName);
        child2.displayInfo();
    }
    
}
