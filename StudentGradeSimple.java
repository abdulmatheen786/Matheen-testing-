package myfirstpackage;

public class StudentGradeSimple {
    public static void main(String[] args) {
        // Updated subject marks
        int math = 30;
        int science = 90;
        int english = 85;

        // Calculate total and average
        int total = math + science + english;
        double average = total / 3.0;

        // Print average
        System.out.println("Average Marks: " + average);

        // Check if any subject is below 35
        boolean lowScore = (math < 35 || science < 35 || english < 35);

        // Determine grade
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 75) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        // Print grade
        System.out.println("Grade: " + grade);

        // Print custom message
        if (lowScore) {
            System.out.println("Failed due to low score in at least one subject.");
        }

        if (grade.equals("Fail") || lowScore) {
            System.out.println("Please work harder next time.");
        } else if (grade.equals("A+") || grade.equals("A")) {
            System.out.println("Excellent performance!");
        } else {
            System.out.println("Keep improving.");
        }
    }
}

