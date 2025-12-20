package basics;

/*
 * Loop:
 * A loop is a control flow statement that allows you to repeatedly execute a block of code.
 *
 * There are three types of loops in Java:
 * 1. For Loop
 * 2. While Loop
 * 3. Do-While Loop
 * 4. For-Each Loop (Java 5)
 */
public class Loop {
    /*
     * Note: Here we are using function to demonstrate the use cases of loops.
     * Note: Here, to keep it simple, we will print 1 to 10 using each loop to understand the use cases.
     */

    // For Loop
    static void forLoop() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        }
    }

    // While Loop
    static void whileLoop() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " ");
            i ++;
        }
    }

    // Do While Loop
    static void doWhileLoop() {
        int i = 1;
        do {
            System.out.println(i + " ");
            i ++;
        } while (i <= 10);
    }

    // For Each Loop
    // Read More about foreach: https://docs.oracle.com/javase/8/docs/technotes/guides/language/foreach.html
    static void forEachLoop() {
        int[] nums = {10, 20, 30, 40, 50};

        for (int num : nums) {
            System.out.println(num + " ");
        }
    }

    public static void main(String[] args) {
        forLoop();      // for

        whileLoop();    // while

        doWhileLoop();  // do while

        forEachLoop();  // foreach
    }
}
