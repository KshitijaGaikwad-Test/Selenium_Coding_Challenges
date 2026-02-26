package StringPrograms;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String input = "swiss";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (input.indexOf(ch) == input.lastIndexOf(ch)) {
                System.out.println("First non-repeated character is: " + ch);
                break;
            }
        }
    }
}
