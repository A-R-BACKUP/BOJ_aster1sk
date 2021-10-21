import java.util.Scanner;

public class compare_two_num {
    public static void main(String[] args) {
        int a, b;
        Scanner x = new Scanner(System.in);
        a = x.nextInt();
        b = x.nextInt();
        if (a > b){
            System.out.println(">");
        }
        else if (a < b) {
            System.out.println("<");
        }
        else {
            System.out.println("==");
        }
    }
}