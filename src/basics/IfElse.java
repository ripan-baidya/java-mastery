package basics;

/*
 * if else:
 *
 * The if-else statement is a conditional statement that allows you to execute different blocks of code based
 * on the value of a boolean expression.
 *
 * The basic syntax of the if-else statement is:
 * if (condition) {
 *     // code to be executed if the condition is true
 * } else {
 *     // code to be executed if the condition is false
 * }
 *
 * The if statement checks the value of the condition.
 * - If the condition is true, the code within the corresponding block is executed.
 * - If the condition is false, the code within the else block is executed.
 *
 * The if-else statement can be extended by using the else if statement. The else if statement allows you to
 * check multiple conditions. If the first condition is false, the compiler checks the second condition, and
 * so on. If a condition is true, the corresponding block of code is executed, and the program does not check
 * the remaining conditions.
 */
public class IfElse {
    // Note: Here we are using function to demonstrate the use cases of if-else, if,else if and else.
    // Don't worry if you don't know function, we will cover it later.

    // Example: Check whether a number is even or odd
    static void ifElse() {
        int number = 10;

        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }

    // Example: Check whether a number is positive or negative or zero
    static void ifElseIfElse() {
        int number = 10;

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }

    public static void main(String[] args) {
        // if else example
        ifElse();

        // if else-if else example
        ifElseIfElse();
    }
}
