package StringPrograms;
import java.util.*;
public class RemoveDuplicateHashSet {
    public static void main(String[] args) {
        String input = "Automation";
        input = input.toLowerCase();
        Set<Character> set = new HashSet<>();

        for(char ch : input.toCharArray()){
            set.add(ch);
        }
        System.out.println(set);
    }
}
