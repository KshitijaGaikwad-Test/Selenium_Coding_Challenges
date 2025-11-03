package NumbersPrograms;

public class FIZZBUZZ {
    public static void main(String[] args) {
        int[] arr = {2, 3, 15, 6, 7, 8, 10, 30};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.println("NumbersPrograms.FIZZBUZZ");
            } else if (arr[i] % 3 == 0) {
                System.out.println("FIZZ");

            } else if (arr[i] % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}
