import java.util.Scanner;

public class test_result {
    public static void main(String[] args) {
        int r = 0;
        Scanner x = new Scanner(System.in);
        r = x.nextInt();
        if (r >= 90 && r <= 100 ){
            System.out.println("A");
            return;
        }
        else if (r >= 80 && r <= 89){
            System.out.println("B");
            return;
        }
        else if (r >= 70 && r <= 79){
            System.out.println("C");
            return;
        }
        else if (r >= 60 && r <= 69) {
            System.out.println("D");
            return;
        }
        else{
            System.out.println("F");
            return;
        }
    }
}