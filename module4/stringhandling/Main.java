package module4.stringhandling;

// String vs StringBuilder vs StringBuffer

// String is immutable. Every time you modify a String, a new String object is created in the memory. This can lead to performance issues when performing many modifications, as it creates multiple objects and increases memory usage. Strings are stored in the String Pool, which is a special memory region for storing String literals.
// Example: String str = "Hello"; str += " World"; // creates a new String object

// StringBuilder is mutable and designed for situations where you need to perform many modifications to a string. It is not synchronized, which means it is not thread-safe but offers better performance in single-threaded applications. StringBuilder objects are stored in the heap memory.
// Example: StringBuilder sb = new StringBuilder("Hello"); sb.append(" World"); // modifies the same object

// StringBuffer is also mutable like StringBuilder but is sychronized, making it thread-safe. This means that multiple threads can safely modify a StringBuffer object without causing data corruption. However, this sychronization comes with a performance cost, making StringBuffer slower than StringBuilder in single-threaded scenarios. StringBuffer objects are also stored in the heap memory.
// Example: StringBuffer sbf = new StringBuffer("Hello"); sbf.append(" World"); // modifies the same object

// In summary, use String for fixed strings, StringBuilder for mutable strings in single-threaded contexts, and StringBuffer for mutable strings in multi-threaded contexts.

// String --> Immutable, thread-safe, method chaining is costly
// StringBuilder --> Mutable, not thread-safe, faster for single-threaded
// StringBuffer --> Mutable, thread-safe, slower due to synchronization
public class Main {
    public static void main(String args[]){
        String str= "Hello";
        String str2= "Hello";
        String str3= new String("Hello");
        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer sbf = new StringBuffer("Hello");

        for(int i=0; i<10; i++){
            // This creates a new String object in each iteration but assignment to str reference 
            str+=" World";
            // This also creates a new String object in each iteration but reference to str2 is lost after each iteration
            str2.concat(" World");
            // This also creates a new String object in each iteration but reference to str3 is lost after each iteration
            str3.concat(" World");
            // This modifies the same StringBuilder object
            sb.append(" World");
            // This modifies the same StringBuffer object
            sbf.append(" World");
        }
        System.out.println("Final String: " + str);
        System.out.println("Final String2: " + str2);
        System.out.println("Final String3: " + str3);
        System.out.println("Final StringBuilder: " + sb);
        System.out.println("Final StringBuffer: " + sbf);

    }
    
}
