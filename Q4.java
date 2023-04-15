import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 10 and 20 ");
        int a = scanner.nextInt();
        if (a >= 10 && a <= 20) {
            System.out.println("You are right");
        } else {
            System.out.println("The answer is too high ");
            if (a < 10) {
                System.out.println("The answer is too low");
            }

        }
    }}
