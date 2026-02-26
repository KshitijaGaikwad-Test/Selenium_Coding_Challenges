package StringPrograms;

public class SimilarCharFromTwoString {
    public static void main(String[] args) {
            String input1 = "Kshitija";
            String input2 = "Mayur";

            char[] iparr1 = input1.toLowerCase().toCharArray();
            char[] iparr2 = input2.toLowerCase().toCharArray();

            for (int i = 0; i < iparr1.length; i++) {
                for (int j = 0; j < iparr2.length; j++) {
                    if (iparr1[i] == iparr2[j]) {
                        System.out.println(iparr1[i]);
                    }
                }
            }

        }
    }
