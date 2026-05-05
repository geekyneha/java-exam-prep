package module1;
// isprime is a function that checks if a number is prime or not. A prime number is a number that is only divisible by 1 and itself. For example, 2, 3, 5, 7, 11 are prime numbers, while 4, 6, 8, 9, 10 are not prime numbers.
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
