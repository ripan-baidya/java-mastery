package basics;

/*
 * Switch:
 * The switch statement is a selection statement in Java that is used to perform different actions
 * based on different conditions.
 *
 * The syntax of the switch statement is as follows:
 *
 * switch (expression) {
 *     case value1:
 *         // code to be executed if expression matches value1
 *         break;
 *     case value2:
 *         // code to be executed if expression matches value2
 *         break;
 *     default:
 *         // code to be executed if expression does not match any case values
 *         break;
 * }
 *
 * The expression in the switch statement is evaluated once. The value of the expression is compared
 * with each case value using the == operator. If there is a match, the code block associated with that
 * case is executed. The break statement is used to exit the switch block after executing the code.
 *
 * If no case matches the value of the expression, the code block associated with the default case is
 * executed. If there is no default case, the program continues with the next statement after the switch
 * block.
 */
public class SwitchExample {
    // Switch old style, Java pre 12
    private static void switchOldStyle() {
        final int dayNumber = 1;
        switch (dayNumber) {
            case  1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }
    }

    // Switch new style, Java 12+
    private static void switchNewStyle() {
        final int dayNumber = 5;

        switch (dayNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day number");
        }
    }

    public static void main(String[] args) {
        switchOldStyle();

        switchNewStyle();
    }
}
