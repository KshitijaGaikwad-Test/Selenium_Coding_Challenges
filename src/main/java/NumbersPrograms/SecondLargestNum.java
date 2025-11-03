package NumbersPrograms;

import java.util.Arrays;

//From this logic You can get following thing by changing < & > sign
// < - will give Decreasing order list
//> - will give Decreasing order list
//input[0] - As per given index you will get larger or smaller number

public class SecondLargestNum {
    public static void main(String[] args) {
        int[] input = {3, 5, 2, 9, 6, 3, 7, 4, 18, 24};
        int temp = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {

                if (input[i] < input[j]) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }


            }

        }
        System.out.println("Second Largest number is :" + input[1]);

        System.out.println("Second Largest number is :" + Arrays.toString(input));

    }
}
