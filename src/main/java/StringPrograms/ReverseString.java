package StringPrograms;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Kshitija";
        String output = "";

        for(int i=0; i<input.length(); i++){
            output = input.charAt(i)+output;
        }
        System.out.println("Reversed String is : "+output);
    }
}
