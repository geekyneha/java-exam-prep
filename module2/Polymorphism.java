package module2;

public class Polymorphism {

   // Method overloading example by changing number of parameters 
    public int  add(int a, int b){
        return a+b;

    }

    public int add(int a, int b, int c){
        return a+b+c;
    }
    // Method overloading example by changing data types of parameters
    public double add(double a, double b){
        return a+b;
    }

    public static void main(String args[]){

        Polymorphism poly = new Polymorphism();
        System.out.println("Sum of 2 and 3: " + poly.add(2,3));
        System.out.println("Sum of 2 , 3, and 4: " + poly.add(2,3,4));
        System.out.println("Sum of 2.5 and 3.5: " + poly.add(2.5,3.5));

    }
    
}
