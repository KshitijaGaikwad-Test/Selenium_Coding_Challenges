package StringPrograms;

public class ToggleString {
    public static void main(String[] args) {
        String input = "HackatHOne";
        String output = "";

        for(int i=0; i<input.length(); i++){
            char ch= input.charAt(i);

            if(Character.isUpperCase(ch)){
                output = output + Character.toLowerCase(ch);
            }else if (Character.isLowerCase(ch)){
                output = output + Character.toUpperCase(ch);
            }else
                output = output + ch;
        }
        System.out.println("Toglled String is : "+output);
    }
}
