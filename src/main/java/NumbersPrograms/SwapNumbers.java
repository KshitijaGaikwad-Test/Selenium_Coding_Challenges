package NumbersPrograms;

public class SwapNumbers {
    public static void main(String[] args) {
        int a=5;
        int b=8;


        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Value of a after swapping is "+a);
        System.out.println("Value of b after swapping is "+b);
    }
}
