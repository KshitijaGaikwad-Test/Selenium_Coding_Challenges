package NumbersPrograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int orgNum = 288761;
        int num = orgNum;
        int reverse =0;

        while(num!=0){
            int remainder = num%10;
            reverse = reverse*10 +remainder;
            num = num/10;
        }
        System.out.println(reverse);
    }
}
