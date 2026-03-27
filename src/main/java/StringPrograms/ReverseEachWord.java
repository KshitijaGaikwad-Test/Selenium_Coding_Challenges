package StringPrograms;

public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "Java is nice Programming language";
        String output = "";
        String[] input2 = input.split(" ");

        for(int i=0; i<input2.length; i++){
            String word = input2[i];
            String revword = "";
            for(int j=0; j<word.length(); j++){
                revword = word.charAt(j)+revword;
            }
            output = output + revword + " ";
        }
        System.out.println(output);
    }
}
