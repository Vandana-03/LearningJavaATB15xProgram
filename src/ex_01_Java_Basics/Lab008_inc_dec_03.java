package ex_01_Java_Basics;

public class Lab008_inc_dec_03 {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + x++ + ++x + --x;
        System.out.println(x);
        System.out.println(y);

        System.out.println("********************");
        int k = 8;
        int r = --k + k++ + ++k + k--;
        System.out.println(k);
        System.out.println(r);


    }
}
