package module3;

public class Throws {

    public static void main (String args[]) throws ArrayIndexOutOfBoundsException {
        
        int[] numerators = {10,20,30,40};
        int[] denominators = {2,5,10,4}; // Note the zero

       for(int i=0; i< numerators.length+1;i++){
        
       
            System.out.println("Dividing " + numerators[i] + " by " + denominators[i]);
            System.out.println("Result: " + divide(numerators[i], denominators[i]));
         

       }

    }

    // throws keyword used to declare that a method may throw an exception. It informs the caller of the method about the potential exception, allowing them to handle it appropriately. It is part of the method signature and is placed after the method's parameter list. It does not handle the exception itself; it simply indicates that the method can throw the specified exception.

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }


    
}
