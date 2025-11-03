package NumbersPrograms;

public class ExtractNumber {
    public static void main(String[] args) {
        String input = "jhshgs78jsj88ss";
        String Letters = "";
        String numbers = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                Letters = Letters + ch;
            } else if (ch >= '0' && ch <= '9') {
                numbers = numbers + ch;

            }
        }
        System.out.println("Letters are :"+Letters);
        System.out.println("Numbers are :"+numbers);
    }
}
