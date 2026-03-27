package StringPrograms;

import software.amazon.awssdk.services.s3.endpoints.internal.Value;

public class TwoStringsIsomorphic {
    public static void main(String[] args) {
        String input1 = "egg";
        String input2 = "add";

        char[] iparr1 = input1.toLowerCase().toCharArray();
        char[] iparr2 = input2.toLowerCase().toCharArray();

        boolean isIsomorphic = true;

        if (iparr1.length != iparr2.length) {
            isIsomorphic = false;
        } else {
            for (int i = 0; i < iparr1.length; i++) {
                char ch1 = iparr1[i];
                char ch2 = iparr2[i];

                if (ch1 != ch2) {
                    isIsomorphic = false;
                    break;
                }
            }
        }

        if (isIsomorphic) {
            System.out.println("The two strings are isomorphic.");
        } else {
            System.out.println("The two strings are not isomorphic.");
        }
    }
}
