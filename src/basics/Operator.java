package basics;

/*
 * Operator:
 * Operator is a symbol or combination of symbols that allows you to perform operations on variables
 * or values.
 *
 * Java supports the following types of operators:
 *
 * 1. Arithmetic Operators:
 *    - Addition +
 *    - Subtraction -
 *    - Multiplication *
 *    - Division /
 *    - Modulus %
 *
 * 2. Relational Operators:
 *    - Equal to ==
 *    - Not equal to !=
 *    - Greater than >
 *    - Less than <
 *    - Greater than or equal to >=
 *    - Less than or equal to <=
 *
 * 3. Logical Operators:
 *    - AND &&
 *    - OR ||
 *    - NOT !
 *
 * 4. Bitwise Operators:
 *    - AND &
 *    - OR |
 *    - XOR ^
 *    - Complement ~
 *    - Shift Left <<
 *    - Shift Right >>
 *
 * 5. Assignment Operators:
 *    - Assignment =
 *    - Add and assign +=
 *    - Subtract and assign -=
 *    - Multiply and assign *=
 *    - Divide and assign /=
 *    - Modulus and assign %=
 *
 * 6. Increment and Decrement Operators:
 *    - Increment ++
 *    - Decrement --
 *
 * 7. Ternary Operator:
 *    - Condition ? Expression1 : Expression2
 *
 */
public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic operators
        int sum = a + b;        // 15
        int difference = a - b; // 5
        int product = a * b;    // 50
        int quotient = a / b;   // 2
        int remainder = a % b;  // 0 remainder

        // Relational Operator
        boolean isEqual = a == b;    // false
        boolean isNotEqual = a != b; // true
        boolean isGreater = a > b;   // true
        boolean isLess = a < b;      // false
        boolean isGreaterOrEqual = a >= b;  // true
        boolean isLessOrEqual = a <= b;     // false

        // Logical Operator
        boolean and = a > b && b < a; // true
        boolean or = a > b || b < a;  // true
        boolean not = !(a > b);       // false

        // Bitwise Operator
        int andBitwise = a & b; // 0
        int orBitwise = a | b;  // 15
        int xorBitwise = a ^ b; // 15
        int complement = ~a;    // -11
        int shiftLeft = a << 1; // 20
        int shiftRight = a >> 1;// 5

        // Assignment Operator
        int assign = a; // 10
        int addAssign = a += b; // 15
        int subtractAssign = a -= b; // 5
        int multiplyAssign = a *= b; // 50
        int divideAssign = a /= b; // 2
        int modulusAssign = a %= b; // 0

        // Increment and Decrement Operator
        int increment = a++; // 10
        int decrement = b--; // 5

        // Ternary Operator
        int ternary = (a > b) ? a : b; // 10
    }
}
