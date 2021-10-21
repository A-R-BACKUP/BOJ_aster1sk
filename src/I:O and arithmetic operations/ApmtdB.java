import java.util.Scanner;

public class ApmtdB {
    public static void main(String[] args) {
        int a, b;
        Scanner x = new Scanner(System.in);
        a = x.nextInt();
        b = x.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}