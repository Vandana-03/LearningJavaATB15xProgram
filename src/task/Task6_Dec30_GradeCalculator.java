package task;
//Write a program that calculates and
// displays the letter grade for a given numerical score
// (e.g., A, B, C, D, or F) based on the following grading scale:
//A: 90-100
//B: 80-89
// C: 70-79
// D: 60-69
// F: 0-59

import java.util.Scanner;

public class Task6_Dec30_GradeCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks=sc.nextInt();
        if (marks<0 || marks >100)
            System.out.println("Invalid input");
        else if(marks>=90)
            System.out.println("A grade");
        else if(marks>=80)
            System.out.println("B grade");
        else if(marks>=70)
            System.out.println("C grade");
        else if(marks>=60)
            System.out.println("D grade");
        else
            System.out.println("F grade");
    }
}
