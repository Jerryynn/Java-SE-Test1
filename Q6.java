import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Name a fruit: ");
       String fruit= scanner.nextLine();


        switch (fruit) {
            case "apple":
                System.out.println(" This is apple");
                break;
            case "orange":
                System.out.println("This is orange");
                break;
            case "strawberry":
                System.out.println("This is strawberry");
                break;
            default:
                System.out.println("The fruit is not apple, orange and strawberry");
                break;
        }

    }
}
