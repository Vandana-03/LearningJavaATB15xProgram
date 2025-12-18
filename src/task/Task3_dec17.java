package task;
import java.util.Scanner;

public class Task3_dec17 {
        public static void main(String[] args)
        {   //method3
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number to generate the multiplication table:");
            int n = sc.nextInt();
            for(int i=1;i<=10;i++)
            {
                System.out.printf("%d * %d= %d%n", n,i,n*i);
            }
        }
    }