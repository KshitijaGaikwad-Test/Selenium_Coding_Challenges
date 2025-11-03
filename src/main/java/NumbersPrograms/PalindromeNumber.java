package NumbersPrograms;

public class PalindromeNumber {
    public static void main(String[] args) {
        int orgNum = 678278;
        int num = orgNum;
        int reverse =0;

        while(num!=0){
            int remainder = num%10;
            reverse = reverse *10+remainder;
            num = num/10;
        }
        System.out.println("Reverse Number is :"+reverse);
        if(orgNum == reverse){
            System.out.println("Number is Palindrome");
        }else System.out.println("Number is not palindrome");
    }
}
