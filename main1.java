import java.util.Scanner;

public class Main1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        x <= 0 ? System.out.println(0) : (x > 0 && x < 1) ? System.out.println(x) : System.out.println(x * x * x * x);
   
    }
