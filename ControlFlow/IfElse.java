import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Solve this riddle: I speak without a mouth and hear without ears." +
        "I have no body, but I come alive with the wind. What am I?");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("Echo")){
            System.out.println("Wow. You found the correct answer, Congrats!");
        } else {
            System.out.println("Well, at least you tried... Kepp thinking.");
        }

        input.close();


        
    }
}
