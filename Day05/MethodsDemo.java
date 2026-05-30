package Day05;

public class MethodsDemo {

    static int add(int a, int b){
        return a + b;
    }

    static double add(double a, double b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

    static int square(int n){
        return n * n;
    }

    static double average(int a, int b){
        return (double)(a + b) / 2;
    }

    static String greet(String name){
        return "Hello " + name;
    }

    static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static void main(String[] args){

        System.out.println("-- Method Overloading --");
        System.out.println(add(2, 3));
        System.out.println(add(2.5, 3.5));
        System.out.println(add(1, 2, 3));

        System.out.println("-- Other Methods --");
        System.out.println(square(5));
        System.out.println(average(10, 20));
        System.out.println(greet("Kavya"));
        System.out.println(isEven(4));
        System.out.println(isEven(7));
    }
}