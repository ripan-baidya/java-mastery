package method;

/*
 * Pass by value:
 * When a parameter is pass-by-value, the caller and the callee method operate on two different variables
 * which are copies of each other. Any changes to one variable don’t modify the other.
 * It means that while calling a method, parameters passed to the callee method will be clones of original
 * parameters.
 * Any modification done in callee method will have no effect on the original parameters in caller method.
 *
 * Ref Link: https://www.baeldung.com/java-pass-by-value-or-pass-by-reference
 */
public class PassByValue {
    /*
     * This method Swap two variables.
     * Note: Here, we are taking primitive data type as parameter. So any modification done inside the swap
     * method won't affect the value of original variables.
     */
    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Before swap
        System.out.println("Before swap: a = " + a + "," + " b = " + b);

        // pass by value
        swap(a, b);

        // After swap
        System.out.println("After swap: a = " + a + "," + " b = " + b);
    }

    /*
     * Explanation:
     * 1. The variables “a” and “b” in the main method are primitive types and their values are directly
     *    stored in the stack memory.
     * 2. When we call method swap(), an exact copy for each of these variables is created and stored at
     *    a different location in the stack memory.
     * 3. Any modification to these copies affects only them and leaves the original variables unaltered.
     */
}
