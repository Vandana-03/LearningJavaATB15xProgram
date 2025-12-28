package task;

//Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides,
// determine if the triangle is
// equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal).
// Use an if-else statement to classify the triangle.

import java.util.Scanner;

public class Task4_Dec27_TriangleClassifier {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Side 1 angle");
        int s1= sc.nextInt();
        System.out.println("Enter Side 2 angle");
        int s2=sc.nextInt();
        System.out.println("Enter Side 3 angle");
        int s3= sc.nextInt();
        if (s1==s2 && s2==s3)
            System.out.println("Its an equilateral triangle");
        else if (s1==s2 || s2==s3 || s3==s1)
            System.out.println("Its an Isosceles triangle");
        else
            System.out.println("Its a scalene triangle");
    }
}
