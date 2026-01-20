package module2.inheritance.multilevel;

public class Parent extends GrandParent {
    public String schoolName;

    public Parent(){
        
        

        this.schoolName = "Hogwarts";
    }
    
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Parent School Name: " + schoolName);
    }
    
}
