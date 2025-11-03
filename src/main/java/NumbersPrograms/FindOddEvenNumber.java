package NumbersPrograms;

public class FindOddEvenNumber {
    public static void main(String[] args) {
        int[] numbers = {2,4,5,3,6,7,8};

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2==0){
                System.out.println(numbers[i]+" Number is even");
            }else{
                System.out.println(numbers[i]+" Number is odd");
            }
        }

    }
}
