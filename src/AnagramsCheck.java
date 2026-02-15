import java.util.Arrays;
import java.util.Scanner;

public class AnagramsCheck {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().replace("\\s", "").toLowerCase();
        String b = scanner.nextLine().replace("\\s", "").toLowerCase();
        scanner.close();

        if (a.length() == b.length()) {
            char[] charAArray = a.toCharArray();
            char[] charBArray = b.toCharArray();
            Arrays.sort(charAArray);
            Arrays.sort(charBArray);

            if (Arrays.equals(charAArray, charBArray)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
