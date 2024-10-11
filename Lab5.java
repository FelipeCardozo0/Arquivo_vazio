public class test {
    public static void main(String[] args) {
        System.out.println(countCharacters("O botafogo Vai ser campeao da libertadores"));

        String mississippi = "mississippi";
        String str = "!\"#$%&'()*+,-./0123456789:;ABCDEabcde ";
        String str2 = "!\"#$%&'()*+,-./0123456789:;ABCDEabcde !\"#$%&'()*+,-./0123456789:;ABCDEabcde !\"#$%&'()*+,-./0123456789:;ABCDEabcde ";

        System.out.println();
        System.out.println(countCharacters(mississippi));
        System.out.println();
        System.out.println(countCharacters(str));
        System.out.println();
        System.out.println(countCharacters(str2));
    }

    public static String countCharacters(String s){
        StringBuilder result =new StringBuilder();
        for (int i =0;i <s.length();i++){
            char currentChar=s.charAt(i);
            int count=0;

            for (int j =0; j < s.length(); j++){
                if (s.charAt(j) ==currentChar){
                    count++;
                }
            }
            if (s.indexOf(currentChar) == i){
                result.append(currentChar).append(": ").append(count).append("\n");

            }
        }
        return result.toString();
    }
}
