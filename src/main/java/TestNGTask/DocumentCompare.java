package TestNGTask;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DocumentCompare {
    public static List<List<String>> findDocumentChanges (String original, String edited){
        String [] originalWords = original.split(" ");
        String [] editedWords = edited.split(" ");

        List<List<String>> differences = new ArrayList<>();
        int max = Math.max(originalWords.length,editedWords.length);
        for(int i=0; i<max; i++){
            String oWord = i < originalWords.length ? originalWords[i]:"";
            String eWord = i < editedWords.length ? editedWords[i]:"";

            if(!oWord.equals(eWord)){
                differences.add(List.of(oWord,eWord));
            }
        }
        return  differences;
    }

    @Test
    public void testModifiedWord(){
        List<List<String>> result = findDocumentChanges("kshitija gaikwad s","kshitija g");
        Assert.assertEquals(result.size(),1);
        Assert.assertEquals(result.get(0),"gaikwad");
        Assert.assertEquals(result.get(1),"g");
    }
}
