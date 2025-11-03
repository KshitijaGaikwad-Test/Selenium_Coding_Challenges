package StringPrograms;

public class VowelsOrConsonants {
    public static void main(String[] args) {
        String input = "Kshitija";
        char[] output = {'a','e','i','o','u'};

        for(int i=0; i<input.length(); i++){
            boolean isVowel = false;
            for(int j=0; j<output.length;j++){
                if(Character.toLowerCase(input.charAt(i))==output[j]){
                    isVowel = true;
                    break;
                }

            }
            if(isVowel){
                System.out.println(input.charAt(i)+" is Vowel");
            }else{
                System.out.println(input.charAt(i)+" is consonants");
            }
        }
    }

}
