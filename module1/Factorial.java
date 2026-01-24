package module1;
// WAP to calculate factorial of number n using for loop.
public class Factorial {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static int calcFactorial(int n){
        if(n<0){
            throw new IllegalArgumentException("Negative numbers do not have factorials.");
        }
        if(n==0 || n==1){
            return 1;
        }
        
        for(int i=n-1; i>1; i--){

            n*=i;


        }
        return n;
    }
    public static void main(String args[]){

        System.out.println(calcFactorial(5)); // 120
        System.out.println(calcFactorial(0)); // 1
        System.out.println(calcFactorial(1)); // 1
        System.out.println(calcFactorial(6)); // 720
        System.out.println(calcFactorial(3)); // 6
        System.out.println(fact(5));//120
        System.out.println(calcFactorial(-4)); // Exception
    

    }
    
}
