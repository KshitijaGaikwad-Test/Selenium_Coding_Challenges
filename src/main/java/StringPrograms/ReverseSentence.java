package StringPrograms;

public class ReverseSentence
{
    public static void main(String[] args) {
        String input = "Java is nice Programming language";
        char[] input2 = input.toCharArray();
        String output = "";

        for(int i=0; i<input2.length; i++){
            output = input2[i] + output;
        }

        System.out.println(output);
    }
}
