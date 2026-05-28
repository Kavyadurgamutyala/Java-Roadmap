package Day02;
public class MathUtils {

    static int add(int a, int b){
        return a + b;
    }

    static double add(double a, double b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args){
        System.out.println("int add:    " + add(2, 3));
        System.out.println("double add: " + add(2.5, 3.5));
        System.out.println("3 nums add: " + add(1, 2, 3));
    }
}

