// Module 3: Exception

// This program demonstrates basic exception  in Java.
// It attempts to divide elements from two arrays and will throw an ArithmeticException when division by zero is attempted.  

package module3;

public class ExceptionDemo {

    public static void main(String args[]){
        int[] numerators = {10,20,30,40};
        int[] denomintaors = {2,5,0,4};

        for(int i=0; i < numerators.length; i++){

            System.out.println("Dividing " + numerators[i] + " by " + denomintaors[i]);
            System.out.println("Result: " + divide(numerators[i], denomintaors[i]));

        }
    }

    public static int divide(int a, int b){
        return a/b;
    }

    
}
