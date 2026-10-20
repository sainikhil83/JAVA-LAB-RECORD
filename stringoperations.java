import java.util.Scanner;

public class stringoperations {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = s.nextLine();

        System.out.println("\n--- STRING OPERATIONS ---");

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        if (str.length() > 0) {
            System.out.println("First character: " + str.charAt(0));
            System.out.println("Last character: " + str.charAt(str.length() - 1));
        }

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reverse: " + reverse);

        System.out.print("\nEnter another String to compare: ");
        String str2 = s.nextLine();

        if (str.equals(str2)) {
            System.out.println("Both Strings are equal");
        } else {
            System.out.println("Both Strings are not equal");
        }

        System.out.println("Concatenation: " + str.concat(str2));

        System.out.print("\nEnter a word to search: ");
        String search = s.nextLine();

        if (str.contains(search)) {
            System.out.println("The word is present in the String");
        } else {
            System.out.println("The word is not present in the String");
        }

        int position = str.indexOf(search);

        if (position != -1) {
            System.out.println("Position of word: " + position);
        } else {
            System.out.println("Word not found");
        }

        System.out.print("\nEnter a word to replace: ");
        String oldWord = s.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = s.nextLine();

        System.out.println("After replacement: " + str.replace(oldWord, newWord));

        System.out.println("\nStarts with '" + search + "': " + str.startsWith(search));
        System.out.println("Ends with '" + search + "': " + str.endsWith(search));
        System.out.println("Trimmed String: " + str.trim());

        System.out.println("\nCharacters in the String:");

        char[] characters = str.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }

        s.close();
    }
}
