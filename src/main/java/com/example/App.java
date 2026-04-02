import java.util.Scanner;

public class ScholarshipCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for 3 subjects
        System.out.print("Enter marks for Subject 1: ");
        double s1 = sc.nextDouble();
        System.out.print("Enter marks for Subject 2: ");
        double s2 = sc.nextDouble();
        System.out.print("Enter marks for Subject 3: ");
        double s3 = sc.nextDouble();

        double totalMarks = s1 + s2 + s3;
        double percentage = (totalMarks / 300) * 100;
        
        // Pass/Fail check (assuming 40% minimum to pass)
        String status = (s1 >= 40 && s2 >= 40 && s3 >= 40) ? "PASS" : "FAIL";

        // Grade calculation
        char grade;
        if (percentage >= 90) grade = 'A';
        else if (percentage >= 75) grade = 'B';
        else if (percentage >= 50) grade = 'C';
        else grade = 'F';

        // Scholarship eligibility (e.g., >= 85% and passed)
        boolean isEligible = (percentage >= 85 && status.equals("PASS"));

        // Output results
        System.out.println("-------------------------");
        System.out.printf("Total Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + status);
        System.out.println("Scholarship Eligible: " + (isEligible ? "Yes" : "No"));
        System.out.println("------------------------- CHANGES MADE ----------------");
    }
}
