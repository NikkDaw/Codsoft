import java.util.Scanner;
public class gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int numOfSubject = sc.nextInt();

        int totalMarks = 0;

        for(int i = 1; i <= numOfSubject; i++){
            System.out.println("Enter the marks for subject "+ i + " between 0 - 100: ");
            int marks = sc.nextInt();

            if(marks < 0 || marks > 100){
                System.out.println("Marks not Valid!!!");
                return;
            }

            totalMarks += marks;
        }

        double avgPercentage = (double)totalMarks / numOfSubject;

        System.out.println("Results: ");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avgPercentage);
        String grade = calculateGrade(avgPercentage);
        System.out.println("Grade: "+ grade);
    }

    public static String calculateGrade(double avgPercentage){
        if(avgPercentage >= 90){
            return "A+";
        }
        else if(avgPercentage >= 80){
            return "A";
        }
        else if(avgPercentage >= 70){
            return "B";
        }
        else if(avgPercentage >= 60){
            return "C";
        }
        else if(avgPercentage >= 50){
            return "D";
        }
        else{
            return "E";
        }
    }
}
