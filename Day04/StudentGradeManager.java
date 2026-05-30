package Day04;

public class StudentGradeManager {
    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "Carol", "David", "Eve"};
        int[][] grades = {
            {85, 90, 78, 92, 88},
            {70, 75, 80, 65, 72},
            {95, 98, 92, 96, 94},
            {60, 65, 70, 55, 68},
            {88, 82, 90, 85, 87}
        };

        double[] avg = new double[5];
        for(int i = 0; i < 5; i++){
            int sum = 0;
            for(int j = 0; j < 5; j++)
                sum += grades[i][j];
            avg[i] = sum / 5.0;
        }

        System.out.println("Student Averages:");
        for(int i = 0; i < 5; i++)
            System.out.println(names[i] + " -> " + avg[i]);
    }
}