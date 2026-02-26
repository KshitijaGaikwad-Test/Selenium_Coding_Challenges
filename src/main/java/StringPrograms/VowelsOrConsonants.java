package StringPrograms;

public class VowelsOrConsonants {
    public static void main(String[] args) {
        String input = "Kshitija";
        input = input.toLowerCase();
        char[] vowels = {'a','e','i','o','u'};

        for(int i=0; i<input.length(); i++){
            boolean isVowel = false;
            for(int j = 0; j< vowels.length; j++){
                if(input.charAt(i)== vowels[j]){
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
