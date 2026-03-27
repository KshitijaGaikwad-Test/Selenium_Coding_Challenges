package StringPrograms;

public class CapitalFirstLetter {
    public static void main(String[] args) {
        String input = "java is nice programming language";
        String output = "";
        String[] input2 = input.split(" ");

        for(int i=0; i<input2.length; i++){
            String word = input2[i];
            String capword = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            output = output + capword + " ";
        }
        System.out.println(output);
    }
}
