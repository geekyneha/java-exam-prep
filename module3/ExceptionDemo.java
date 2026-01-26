// Module 3: Exception

// This program demonstrates basic exception  in Java.
// It attempts to divide elements from two arrays and will throw an ArithmeticException when division by zero is attempted.  
// program will crash during execution. some will execute successfully before the crash.
// This is to demonstrate how exceptions can disrupt normal program flow.

// why called exception ? because some part works except the part which cuases exception. Everything that is after exception will not be executed. To handle such scenarios we use exception handling mechanism in java. In this the part which causes exception is handled and rest of the program continues to execute. 

package module3;

public class ExceptionDemo {

    public static void main(String args[]){
        int[] numerators = {10,20,30,40};
        int[] denomintaors = {2,5,10,4,0};
         // ArrayIndexOutOfBoundsException will also occur when i=4 
        for(int i=0; i < numerators.length ; i++){
           // 
            System.out.println("Dividing " + numerators[i] + " by " + denomintaors[i]);
            System.out.println("Result: " + divide(numerators[i], denomintaors[i]));

        }
        // NullPointerException demo
        String str = null;
        System.out.println("Length of the string is: " + str.length());
    }

    public static int divide(int a, int b){
        // dividing by 0 -> ArithmaticException
        return a/b;
    }

    
}
