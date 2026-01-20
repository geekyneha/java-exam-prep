package module2.inheritance.multilevel;

public class GrandParent {
    public String name; 
    public int age;
    public String surName; // inherited by both Parent and Child
   public GrandParent(){
        this.surName = "Potter";
        this.name ="Albus";
        this.age=90;
    }
    
                    
    public void displayInfo(){
        System.out.println("GrandParent Name: " + name);
        System.out.println("GrandParent Age: " + age);
        System.out.println("GrandParent SurName: " + surName);
    }
}
