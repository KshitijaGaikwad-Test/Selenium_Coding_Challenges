package StringPrograms;

public class DuplicateChar {
    public static void main(String[] args) {
        String input = "programming";
        char[] chars = input.toCharArray();

        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    System.out.println("Duplicate characters are :"+chars[i]);
                    break; // To avoid printing the same character multiple times
                }
            }
        }
    }
}
