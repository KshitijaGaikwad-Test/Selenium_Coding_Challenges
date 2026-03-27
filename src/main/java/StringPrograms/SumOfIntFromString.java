package StringPrograms;

public class SumOfIntFromString {
    public static void main(String[] args) {
        String input = "abhg2565bcsf5";
        int sum = 0;

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isDigit(ch)){
                int num = Character.getNumericValue(ch);
                sum = sum + num;
            }
    }
        System.out.println("Sum of integers in the string: " + sum);
    }
}
