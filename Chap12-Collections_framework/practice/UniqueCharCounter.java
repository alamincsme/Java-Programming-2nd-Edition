import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharCounter {
     private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        String in = scanner.nextLine();

        Set<Character> uniqueChars = new HashSet<>();

        for (char c : in.toCharArray())  {
            uniqueChars.add(c);
        }

        System.out.println("Number of the unique character: " + uniqueChars.size());
    }
}
