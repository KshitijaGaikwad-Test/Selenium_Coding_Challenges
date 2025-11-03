package StringPrograms;

public class CharOccurrence {
    public static void main(String[] args) {
        String input = "amazonnazaa";
        int firstIndex = -1;
        int lastIndex = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }
        System.out.println("FIrst Index of a:" + firstIndex);
        System.out.println("FIrst Index of a:" + lastIndex);


    }
}
