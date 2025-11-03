package StringPrograms;

public class CharOccurance {
    public static void main(String[] args) {
        String input = "Java is object oriented programming language";
        int totalCount = input.length() - input.replace("a","").length();
        System.out.println("Total count of a is :"+totalCount);
    }
}
