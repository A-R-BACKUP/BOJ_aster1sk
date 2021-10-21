/*
https://www.acmicpc.net/problem/2588
 */

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int a, b, b1, b2, b3;
        Scanner x = new Scanner(System.in);
        a = x.nextInt();
        b = x.nextInt();

        b1 = (int)(b / Math.pow(10, 0)) % 10;
        b2 = (int)(b / Math.pow(10, 1)) % 10;
        b3 = (int)(b / Math.pow(10, 2)) % 10;

        System.out.println(a * b1);
        System.out.println(a * b2);
        System.out.println(a * b3);
        System.out.println(a * b);

    }
}
