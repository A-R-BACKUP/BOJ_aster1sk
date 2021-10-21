import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        int l;
        Scanner x = new Scanner(System.in);
        l = x.nextInt();
        if (l >= 1 || l <= 4000) {
            if (l % 4 == 0 && l % 100 != 0 || l % 400 == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}