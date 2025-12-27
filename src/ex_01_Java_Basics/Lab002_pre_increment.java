package ex_01_Java_Basics;

public class Lab002_pre_increment {
    public static void main(String[] args) {
        int z = 10;
        System.out.println(z++ + z);

        int x1 = 5;
        System.out.println("x=" + ++x1);
        System.out.println("x=" + x1);

        int c = 5;
        System.out.println("c=" + c++);
        System.out.println("c=" + c);

        int a = 5;
        int b = ++a + a++;
        System.out.println(a);
        System.out.println(b);

        int x = 10;
        int y = x++ + ++x;
        System.out.println("x=" +x);
        System.out.println("y="+y);

        int p = 7;
        int q = --p + p++ + ++p;
        System.out.println(p);
        System.out.println(q);



    }
}
