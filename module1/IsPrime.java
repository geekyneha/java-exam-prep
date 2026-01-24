package module1;

public class IsPrime {
    
    public static boolean isPrime(int x){
        if( x <= 1 ){
            return false;
        }
        for(int i=2; i * i <= x; i++ ){
            if( x % i ==0 ){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){

        System.out.println(isPrime(11)); // true
        System.out.println(isPrime(15)); // false
        System.out.println(isPrime(2));  // true
        System.out.println(isPrime(1));  // false
        System.out.println(isPrime(29)); // true

    }
}
