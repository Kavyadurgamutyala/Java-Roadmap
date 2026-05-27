public class OperatorsDemo {
    public static void main(String[] args) {

        int a = 10, b = 3;

        System.out.println("-- Arithmetic --");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("-- Relational --");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b:  " + (a > b));
        System.out.println("a < b:  " + (a < b));

        System.out.println("-- Logical --");
        boolean x = true;
        boolean y = false;
        System.out.println("true && false: " + (x && y));
        System.out.println("true || false: " + (x || y));
        System.out.println("!true:         " + (!x));

        System.out.println("-- Ternary --");
        int max = (a > b) ? a : b;
        System.out.println("max = " + max);

        System.out.println("-- Precedence --");
        System.out.println("2 + 3 * 4 = " + (2 + 3 * 4));
        System.out.println("(2+3) * 4 = " + ((2 + 3) * 4));
    }
}