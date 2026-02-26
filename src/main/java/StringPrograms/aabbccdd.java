package StringPrograms;

public class aabbccdd {
    public static void main(String[] args) {
        String input = "aaabb###ccddaa";
        String output = "";
        boolean[] isVisited = new boolean[input.length()];

        for(int i=0; i<input.length(); i++){
            if(isVisited[i]){
                continue;
            }

            char ch = input.charAt(i);
            boolean isDuplicate = false;
            int occurrence = 1;

            if (!Character.isLetter(ch)) {
                continue;
            }


           for(int j=i+1; j<input.length(); j++){
               if(input.charAt(i)==input.charAt(j)){
                   isVisited[j]=true;
                   isDuplicate = true;
                   occurrence++;
               }
           }
           output = output + ch + occurrence;

        }

        System.out.println(output);
    }
}
