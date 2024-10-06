public class Lab5 {
    public static void main(String[] args) {
        // Call the method and print the result
        String result = countCharacters("O botafogo Vai ser campeao da libertadores");
        System.out.println(result);
    }

    public static String countCharacters(String s) {
        StringBuilder result = new StringBuilder(); // To store the counts as a string

        // Iterate over each character in the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int count = 0;

            // Count occurrences of currentChar in the string
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Append the character and its count if it's the first occurrence in the loop
            if (s.indexOf(currentChar) == i) {
                result.append(currentChar).append(" : ").append(count).append("\n");
            }
        }

        // Return the result as a string
        return result.toString();
    }
}


/*
import javax.swing.plaf.IconUIResource;
// Do we need package for input or main method is the input
// Do we need to count spaces

public class Lab5 {
    public static void main(String[] args) {
        System.out.println(countCharacters("mississippi"));


    }
    public static String countCharacters(String s) {
        // Iterate over each character in the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int count = 0;

            // Count occurrences of currentChar in the string
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Print the character and its count if it's the first occurrence in the loop
            if (s.indexOf(currentChar) == i) {
                System.out.println(currentChar + " : " + count);
            }
        }
    }
}

 */

