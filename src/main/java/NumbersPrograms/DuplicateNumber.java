package NumbersPrograms;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] num = {2, 3, 7, 5, 3, 2, 9};
        boolean[] isVisited = new boolean[num.length];

        for (int i = 0; i < num.length - 1; i++) {
            if (isVisited[i]) {
                continue;
            }

            boolean isDuplicate = false;
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    isVisited[j] = true;
                    isDuplicate = true;

                }
            }
            if (isDuplicate) {
                System.out.println("Duplicate numbers are : "+num[i]);
            }
        }
    }
}
