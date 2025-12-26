package method;

/*
 * Pass by reference:
 * When a parameter is pass-by-reference, the caller and the callee operate on the same object.
 * It means that when a variable is pass-by-reference, the unique identifier of the object is sent to the method.
 * Any changes to the parameter’s instance members will result in that change being made to the original value.
 *
 * Ref Link: https://www.baeldung.com/java-pass-by-value-or-pass-by-reference
 */
public class PassByReference {
    public static class Foo {
        int num;

        public Foo(int num) {
            this.num = num;
        }
    }

    private static void modify(Foo a1, Foo b1) {
        a1.num ++;

        b1 = new Foo(10);
        b1.num ++;
    }
    public static void main(String[] args) {
        Foo a = new Foo(10);
        Foo b = new Foo(20);

        // Before modification
        System.out.println("Before modification: a = " + a.num + "," + " b = " + b.num);

        // pass by reference
        modify(a, b);

        // After modification
        System.out.println("After modification: a = " + a.num + "," + " b = " + b.num);
    }
}
