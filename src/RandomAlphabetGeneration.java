import java.util.Random;
import java.util.Scanner;

public class RandomAlphabetGeneration {

    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner =  new Scanner(System.in);

        while (true) {
            System.out.println("Please enter a valid text: ");
            String input = scanner.nextLine();
            int digit = random.nextInt(10) + 1;

            if (!input.isEmpty()) {
                System.out.println("The number generated is : " + digit);
                break;
            } else {
                System.out.println("invalid entry please enter a valid string.");
            }
        }

        scanner.close();
    }


}
