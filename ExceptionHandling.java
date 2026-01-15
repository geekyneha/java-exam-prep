public class ExceptionHandling {

    public static void main(String args[]){
        int num1= 10;
        int num2= 0;
        int arr[] = {1,2,3};
        try{
            System.out.println("Accessing element at index 5: " + arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Attempted to access an invalid array index.");
        }
        String str = null;
        try{
           System.out.println(str.length());
        }
        catch(Exception e){
              System.out.println("Error: Attempted to access length of a null string.");
        }
       ; // This will throw NullPointerException
        System.out.println("Dividing " + num1 + " by " + num2);
        int result = divide(num1, num2);
        System.out.println("Result: " + result);
    }

    public static int divide(int a, int b){
        try{
            return a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
            return -1; // Return a default value or handle it as needed
            
        }
        finally{
            System.out.println("Execution of divide method is complete.");
        }
        //this line will never be reached due to return statements in try and catch blocks hence finally is used to execute code regardless of exception occurrence
    }
    
}
