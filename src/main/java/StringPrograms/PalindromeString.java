package StringPrograms;

public class PalindromeString {
    public static void main(String[] args) {
        String input = "Madam";
        String output = "";

        for(int i=0; i<input.length(); i++){
            output = input.charAt(i)+output;
        }
        if(input.equals(output)){
            System.out.println("String is palindrome");
        }else System.out.println("String is not palindrome");

    }
}