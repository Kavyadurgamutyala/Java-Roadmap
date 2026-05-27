public class bmiCalculator {
    public static void main(String[] args) {
        double weight = 70.0;  // kg
        double height = 1.75;  // meters
        double bmi = weight / (height * height);
        System.out.println("BMI = " + bmi);
    }
}