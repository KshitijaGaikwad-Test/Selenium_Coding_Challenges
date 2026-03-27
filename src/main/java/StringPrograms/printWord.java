package StringPrograms;
// Print word which starts with c from given string
public class printWord {
    public static void main(String[] args) {
        String[] input = {"Java", "is", "a", "Programming", "language", "which", "is", "used", "for", "Automation"};
        for(int i=0; i<input.length; i++){
            if(input[i].startsWith("c") || input[i].startsWith("C")){
                System.out.println(input[i]);
            }
        }
    }
}
