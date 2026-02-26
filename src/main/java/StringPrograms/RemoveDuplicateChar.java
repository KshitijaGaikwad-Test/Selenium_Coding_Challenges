package StringPrograms;

public class
RemoveDuplicateChar {
    public static void main(String[] args) {
        String input = "Automation";
        String output = "";
        input = input.toLowerCase();

        for(int i=0; i<input.length(); i++){

            if(output.indexOf(input.charAt(i))==-1){
                output = output + input.charAt(i);

            }
        }
        System.out.println(output);
    }
}
