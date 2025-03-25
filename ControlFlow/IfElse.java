import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Positive number!");
        } else if (number < 0) {
            System.out.println("Negative number!");
        } else {
            System.out.println("That's zero!");
        }

        input.close();
    }
}
