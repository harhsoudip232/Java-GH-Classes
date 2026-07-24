/*Write a program to find out whether a student is pass or fail; if it requiers total 40% and at least 33%
in each subject to pass. Assume 3 subjects and take marks as an input from the user*/ 

import java.util.Scanner;


public class Result {
    public static void main (String args []) {
        System.out.println("Let's take the input of marks of each subject");
        Scanner sc = new Scanner(System.in);

        // assume all exams are conduct in 100 marks
        System.out.print("Enter Bengali marks: ");
        int bengali_marks = sc.nextInt();
        System.out.print("Enter English marks: ");
        int english_marks = sc.nextInt();
        System.out.print("Enter Mathamtics marks: ");
        int math_marks = sc.nextInt();

        float total_percentage = (bengali_marks + english_marks + math_marks) / 3.0f;
        System.out.println("Overall Percentage is: " + total_percentage);

        if (total_percentage >= 40 && bengali_marks >= 33 && english_marks >= 33 && math_marks >= 33)
        {
                System.out.println("Congratulations!! You passed the exam");
        }
        else 
        {
                System.out.println("Opps!! You failed the exam");
        }
        
        sc.close();
    }
}
