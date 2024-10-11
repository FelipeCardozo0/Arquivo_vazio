public class Main {
    public static void main(String[] args) {
        String mississippi = "mississippi";
        String str = "!\"#$%&'()*+,-./0123456789:;ABCDEabcde ";
        String str2 = "!\"#$%&'()*+,-./0123456789:;ABCDEabcde !\"#$%&'()*+,-./0123456789:;ABCDEabcde !\"#$%&'()*+,-./0123456789:;ABCDEabcde ";
        countCharacters(mississippi);
        System.out.println();
        countCharacters(str);
        System.out.println();
        countCharacters(str2);
    }

    public static void countCharacters(String s) {
        String countedChars = "";
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (countedChars.indexOf(currentChar) == -1) { 
                countedChars += currentChar;
                int count = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == currentChar) {
                        count++;
                    }
                }
                System.out.println(currentChar + ": " + count);
            }
        }
    }
}
