package module1.datatypes;

// Data Types: Data types in java are devided into two categories, primitive data types and non-primitive data types.
// Primitive Data Types: Primmtive data types are perdefined or built-in data types in java. These are the basic data types. Premtive data types has numerical, floating point, charachter and boolen types.

// Numerical data types: - byte, short, int, long
// Floating point data types: flaot, double.
// Charachter data type: char
// Boolean data type: boolean

/*  
Primitive Data Types in Java:

Integer Types:
1. Byte: It is an 8 bit signed two's complement integer.
- Wrapper Class: Byte
- Size : 8 bits
- Minimum value: -2^7 (-128)
- Maximum value: 2^7 - 1 (127);
- Default value: 0
- Example: byte a = 100; byte a = -50;

2. Short: It is a 16 bit signed two's complement integer.
- Wrapper Class: Short
- Size : 16 bits 
- Minimum value : - 2 ^ 15 (-32, 768)
- Maximum value : 2 ^ 15 - 1 ( 32,767)
- Default value : 0
- Example : short s = 10000; short s = -20000;

3. Int : It is a 32 bit signed two's complement integer.
- Wrapper Class: Integer
- Size : 32 bits --> 4 bytes
- Minimum value : -2 ^ 31 (-2,147,483,648)
- Maximum value : 2 ^ 31 - 1 (2,147,483,647)
- Default value : 0
- Example : int i = 100000; int i = -200000;    

4. Long : It is a 64 bit signed two's complemet integer.
- Wrapper Class: Long
- Size : 64 bits --> 8 bytes
- Minimum value : -2 ^ 63 (-9,223,372,036,854
,775,808)
- Maximum value : 2 ^ 63 - 1 (9,223,372,036,854,775,807)
- Default value : 0L
- Example : long l = 100000L; long l = -200000L;

Floating Point Types:
5. Float: It is a single precision 32 bit IEEE 754 floating point. It can store decimal values upto 6 to 7 digits. It is used when we need to save memory in large arrays of floating point numbers.

- Wrapper Class: Float
- Size : 32 bits --> 4 bytes
- Minimum value : 3.4e - 038
- Maximum value : 3.4e + 038
- Default value : 0.0f
- Example : float f1 = 234.5f; float f2 = -456.5f;

6. Double : It is a double precision 64 bit IEE 754
floating point. It can store decimal values upto 15 digits. It is used when we need more precision in floating point numbers.
- Wrapper Class: Double
- Size : 64 bits --> 8 bytes
- Minimum value : 1.7e - 308
- Maximum value : 1.7e + 308
- Default value : 0.0d
- Example : double d1 = 123.4; double d2 = -456.4;
Character Type:
7. Char : It is a single 16 bit Unicode character. It is used to store any character.
- Wrapper Class: Character
- Size : 16 bits --> 2 bytes
- Minimum value : '\u0000' (0)
- Maximum value : '\uffff' (65,535)
- Default value : '\u0000'
- Example : char ch1 = 'A'; char ch2 = '1'; char ch3 = '$';         

Boolean Type:
8. Boolean : It is used to store only two values : true and false. It is used for simple flags that track true/false conditions.
- Wrapper Class: Boolean
- Size : not precisely defined
- Possible values : true and false
- Default value : false
- Example : boolean b1 = true; boolean b2 = false;      


 */


public class Types {

    public static void main(String args[]){
        
        // Numerical Data Types
        byte a = 100;
        short b = 10000;
        int c= 100000;
        long d = 100000L;
        System.out.println("Byte value: " + a);
        System.out.println("Short value: " + b);
        System.out.println("Integer value: " + c);
        System.out.println("Long value: " + d);

        // FLoating Point Data Types
        float e = 234.5f;
        double f = 123.4d;
        System.out.println("Float value: " + e);
        System.out.println("Double value: " + f);

        // Character Data Type
        char g = 'A';
        System.out.println("Character value: " + g);

        // Boolean Data Type
        boolean h = true;
        System.out.println("Boolean value: " + h);
    }

}