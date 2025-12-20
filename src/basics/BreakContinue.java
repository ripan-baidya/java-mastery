package basics;

/*
 * Break & Continue
 *
 * - Break:
 *   - The break statement is used to terminate the loop and exit the loop.
 *   - It is used to interrupt the loop and move to the next statement after the loop.
 *   - The break statement is used in conjunction with loops (for, while, do-while) and switch statements.
 *   - It is important to note that the break statement is used to exit the innermost loop or switch statement.
 *
 * - Continue:
 *   - The continue statement is used to skip the current iteration of the loop and move to the next iteration.
 *   - It is used to skip the remaining code in the current iteration and move to the next iteration.
 *   - The continue statement is used in conjunction with loops (for, while, do-while).
 *   - It is important to note that the continue statement is used to skip the remaining code in the current iteration
 *     and move to the next iteration.
 *   - The continue statement does not exit the loop.
 *   - The loop continues to the next iteration.
 */
public class BreakContinue {
    // Example: break
    private static void breakExample() {
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i); // 1 2 3 4
            // Note: The loop will break when 'i' is equal to 5 and will not print 5.
        }
    }

    // Example: continue
    private static void continueExample() {
        for (int i = 1; i < 10; i++) {
            if (i >  2 && i < 8) {
                continue;
            }
            System.out.println(i); // 1 2 8 9
            // Note: The loop will continue and won't print 3, 4, 5, 6, 7 when condition is true.
        }
    }

    public static void main(String[] args) {
        // breakExample();

        // continueExample();
    }
}
