import software.amazon.awssdk.services.s3.endpoints.internal.Value;

import java.util.ArrayList;
import java.util.List;

public class HSBCTest {
    public static void main(String[] args) {
        List<List<String>> result = findDocumentChanges("kshitija Gaikwad S", "kshitija gai");
        for (List<String> diff : result) {
            System.out.println("Original: " + diff.get(0) + "| Edited: " + diff.get(1) + "");
        }
    }

    public static List<List<String>> findDocumentChanges(String original, String edited) {

        String[] originalWords = original.split(" ");
        String[] editedWords = edited.split(" ");

        List<List<String>> differences = new ArrayList<>();

        int max = Math.max(originalWords.length, editedWords.length);
        System.out.println(max);

        for (int i = 0; i < max; i++) {

            String oWord = i < originalWords.length ? originalWords[i] : "";
            String eWord = i < editedWords.length ? editedWords[i] : "";

            if (!oWord.equals(eWord)) {
                differences.add(List.of(oWord, eWord));
            }
        }
        return differences;
    }
}