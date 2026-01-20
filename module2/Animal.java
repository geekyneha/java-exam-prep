package module2;

public class Animal {
    private String name;
    private int age;
   
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
