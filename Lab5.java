// Java program for the above approach
class Lab5 {
    static void countCharacters(String str)
    {
        int count[] = new int[256];
        for (int i = 0; i < str.length(); i++){
            count[str.charAt(i)]++;
        }

        char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++){
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                if (str.charAt(i) == ch[j]){
                    find++;
                }
            }

            if (find == 1) {
                System.out.println(str.charAt(i) + ":" + count[str.charAt(i)]);
            }
        }
    }

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
}
