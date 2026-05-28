package Day02;
public class TypeCasting {
    public static void main(String[] args) {

        // int to double (automatic)
        int a = 10;
        double b = a;
        System.out.println("int to double: " + b);

        // double to int (manual)
        double x = 9.99;
        int y = (int) x;
        System.out.println("double to int: " + y);

        // int division vs double division
        int p = 10, q = 3;
        System.out.println("int division:    " + p/q);
        System.out.println("double division: " + (double)p/q);

        // String to int
        String s = "42";
        int n = Integer.parseInt(s);
        System.out.println("String to int: " + (n + 1));

        // int to String
        int num = 42;
        String str = String.valueOf(num);
        System.out.println("int to String: " + str);
    }
}