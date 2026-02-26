package NumbersPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 5;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Not Prime");
        }
    }

    //using ternary operator

//
//        int num = 5;
//        boolean isPrime = true;
//
//        for (int i = 2; i <= num / 2; i++) {
//            if (num % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//
//        System.out.println(isPrime ? "Prime" : "Not Prime");
//    }
}