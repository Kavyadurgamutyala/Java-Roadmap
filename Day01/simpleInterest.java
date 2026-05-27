public class simpleInterest {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 5.0;
        double time = 2.0;
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + si);
    }
}