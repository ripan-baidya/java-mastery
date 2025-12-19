package basics;

/*
 * Data Type:
 * Data type is a category of data that defines the type of value that can be stored in a variable.
 * In Java, there are eight primitive data types:
 *
 * 1. byte    - 8-bit integer
 * 2. short   - 16-bit integer
 * 3. int     - 32-bit integer
 * 4. long    - 64-bit integer
 * 5. float   - 32-bit floating point
 * 6. double  - 64-bit floating point
 * 7. char    - 16-bit Unicode character
 * 8. boolean - true/false value
 *
 * Read more: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 */
public class DataType {
    public static void main(String[] args) {
        /*
         * byte:
         * range: -128 to 127, size: 1 byte, default: 0
         */
        byte b = 10;
        System.out.println("byte: " + b);

        /*
         * short:
         * range: -32,768 to 32,767, size: 2 bytes, default: 0
         */
        short s = 20;
        System.out.println("short: " + s);

        /*
         * int:
         * range: -2^31 to 2^31-1 (-2,147,483,648 to 2,147,483,647), size: 4 bytes, default: 0
         */
        int i = 30;
        System.out.println("int: " + i);

        /*
         * long:
         * range: -2^63 to 2^63-1 (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807), size: 8 bytes, default: 0L
         * Note: Use 'L' or 'l' suffix for long literals
         */
        long l = 40;
        System.out.println("long: " + l);

        /*
         * float:
         * 32-bit single-precision floating point, size: 4 bytes, default: 0.0f
         * Note: Use 'f' or 'F' suffix for float literals
         */
        float f = 50.5f;
        System.out.println("float: " + f);

        /*
         * double:
         * 64-bit double-precision floating point, size: 8 bytes, default: 0.0d
         * Note: 'd' or 'D' suffix is optional
         */
        double d = 10.5;
        System.out.println("double: " + d);

        /*
         * char:
         * range: '\u0000' to '\uffff' (0 to 65535), size: 2 bytes, default: '\u0000'
         */
        char c = 'a';
        System.out.println("char: " + c);

        /*
         * char:
         * true/ false value, Size is precisely not defined(JVM dependent), default: false
         */
        boolean bl = true;
        System.out.println("boolean: " + bl);
    }
}