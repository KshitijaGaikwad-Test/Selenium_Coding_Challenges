package StringPrograms;

public class DuplicateWord {
    public static void main(String[] args) {
        String input = "Java is programming language java is nice";
        String[] output = input.split(" ");

        for (int i = 0; i < output.length; i++) {
            for (int j = i + 1; j < output.length; j++) {
                if (output[i].equalsIgnoreCase(output[j])) {
                    System.out.println(output[i]);

                }
            }
        }
    }
}
