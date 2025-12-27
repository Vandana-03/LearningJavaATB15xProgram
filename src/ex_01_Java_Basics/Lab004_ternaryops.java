package ex_01_Java_Basics;

public class Lab004_ternaryops {
    public static void main(String[] args) {
        //check time
        int time=11;
        String result=(time<18) ? "Good day." : "Good evening.";
        System.out.println(result);

        //max and min of a number
        int a=10;
        int b=20;
        int max= (a>b) ? a :b;
        System.out.println("max=" +max);
        int min=(a>b) ? b :a;
        System.out.println("min=" +min);

        //Check Even or Odd
        int num = 7;
        String even_odd= (num%2==0) ? "Even" :"Odd";
        System.out.println(even_odd);

        //Pass or Fail
        int marks = 45;
        String status= (marks>=40)? "PASS": "FAIL";
        System.out.println(status);

        // wish GM,GN,GV
        int timenow=12;
        String message= (timenow<=12) ? "Good morning"
                      : (timenow< 18) ? "Good noon"
                      : "good evening";
        System.out.println(message);

        //Grade System
        int mark=78;
        String grade= (mark>=90) ? "A"
                    : (mark>=75) ? "B"
                    : (mark>=60) ? "C"
                    : (mark>=40) ? "D"
                    : "FAIL";
        System.out.println(grade + " grade");

        //Number Classification
        int n=9;
        String pos_neg= (n>0) ? "positive"
                    :(n<0) ? "negative"
                    : "Zero";
        System.out.println(pos_neg);

        //Age category

        int age=33;
        String category= (age<13) ? "Child"
                        :(age<20) ? "Teenager"
                        :(age<60) ? "Adult"
                        : "Senior Citizen";
        System.out.println("category = " + category);

        //largest of 3 numbers
        int x=110,y=20,z=30;
        int largestno= (x>y) ? (x>z ? x:z)
                     : (y>z) ? y: z;
        System.out.println(largestno);

    }
}
