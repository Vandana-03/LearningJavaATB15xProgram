package ex_01_Java_Basics;

public class Lab006_inc_dec_01 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = ++a + b++ + --a + a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
