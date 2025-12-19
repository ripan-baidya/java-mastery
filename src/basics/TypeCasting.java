package basics;

/*
 * Type casting in Java:
 * Type casting is a mechanism in Java that allows to convert one data type to another.
 *
 * Java supports two types of type casting:
 * 1. Implicit/Widening type casting:
 *    This type of type casting is done automatically by the compiler without any explicit mention.
 *    It is used when casting from a smaller data type to a larger data type or when casting from a
 *    superclass to a subclass.
 *    Rule:  byte -> short -> char -> int -> long -> float -> double
 *
 * 2. Explicit/Narrowing  type casting:
 *    This type of type casting is done explicitly by the programmer using the type casting operator.
 *    It is used when casting from a larger data type to a smaller data type or when casting from a
 *    subclass to a superclass.
 *    Rule: double -> float -> long -> int -> char -> short -> byte
 *    Note: Explicit type casting can lead to loss of data.
 *    The type casting operator is '(' ')'
 *    For example:
 *    int n1 = (int) 10.0; // Explicit type casting from double to int
 *    long l1 = (long) 10; // Explicit type casting from int to long
 */
public class TypeCasting {
    public static void main(String[] args) {
        // Example of Implicit type casting
        byte b1 = 127;
        int i1 = b1; // byte to int
        System.out.println("Implicit: byte to int: " + i1); // 127

        char c1 = 'a';
        int i2 = c1; // char to int
        System.out.println("Implicit: char to int: " + i2); // 97 ASCII value of 'c'


        // Example of Explicit type casting
        double d1 = 10.5;
        int i3 = (int) d1; // double to int
        System.out.println("Explicit: double to int: " + i3); // 10
    }
}
