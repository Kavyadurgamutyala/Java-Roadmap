package Day05;

public class RecursionDemo {

    static int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n - 1);
    }

    static int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static int sumOfDigits(int n){
        if(n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    static int power(int base, int exp){
        if(exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    static void countDown(int n){
        if(n == 0){
            System.out.println("Go!");
            return;
        }
        System.out.println(n);
        countDown(n - 1);
    }

    static void countUp(int n, int max){
        if(n > max) return;
        System.out.println(n);
        countUp(n + 1, max);
    }

    public static void main(String[] args){

        System.out.println("-- Factorial --");
        System.out.println("4! = " + factorial(4));
        System.out.println("5! = " + factorial(5));

        System.out.println("-- Fibonacci --");
        System.out.println("fib(6) = " + fibonacci(6));
        System.out.println("fib(7) = " + fibonacci(7));

        System.out.println("-- Sum of Digits --");
        System.out.println("sumOfDigits(123) = " + sumOfDigits(123));

        System.out.println("-- Power --");
        System.out.println("power(2,3) = " + power(2, 3));
        System.out.println("power(3,4) = " + power(3, 4));

        System.out.println("-- Count Down --");
        countDown(5);

        System.out.println("-- Count Up --");
        countUp(1, 5);
    }
}