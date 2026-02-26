package StringPrograms;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
