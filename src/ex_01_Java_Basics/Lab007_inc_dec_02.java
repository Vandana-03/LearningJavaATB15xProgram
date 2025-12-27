package ex_01_Java_Basics;

public class Lab007_inc_dec_02 {
    public static void main(String[] args) {
        int a = 1;
        int b = a++ + ++a + a++ + ++a;
        System.out.println(a);
        System.out.println(b);

    }
}
