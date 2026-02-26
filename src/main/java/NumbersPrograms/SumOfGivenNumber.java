package NumbersPrograms;

public class SumOfGivenNumber {
    public static void main(String[] args) {
        int number = 1234434;
        int output =0;
        int sum =0;

        while(number!=0){
            output = number%10;
            sum = sum + output;
            number = number/10;
        }

        System.out.println(sum);
    }
}
