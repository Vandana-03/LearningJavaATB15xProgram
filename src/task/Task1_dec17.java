package task;
import java.util.Scanner;

public class Task1_dec17 {
        public static void main(String[] args)
        {   //method2
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number to generate the multiplication table:");
            int n = sc.nextInt();

            System.out.printf("%d*1=%d%n", n, n);
            System.out.printf("%d*2=%d%n", n, n*2);
            System.out.printf("%d*3=%d%n", n, n*3);
            System.out.printf("%d*4=%d%n", n, n*4);
            System.out.printf("%d*5=%d%n", n, n*5);
            System.out.printf("%d*6=%d%n", n, n*6);
            System.out.printf("%d*7=%d%n", n, n*7);
            System.out.printf("%d*8=%d%n", n, n*8);
            System.out.printf("%d*9=%d%n", n, n*9);
            System.out.printf("%d*10=%d%n", n, n*10);
        }
    }