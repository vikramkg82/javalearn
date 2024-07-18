package NextWordSuggestion;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TextProcessing {
    private String inputString;
    private List<String> wordArray = new ArrayList<>();


    public TextProcessing(String inputString){
        this.inputString=inputString;
    }

    private String cleanString(){

         String cleanString = inputString.replaceAll("[^a-zA-Z\\s]", "");
         return cleanString;
    }

    private List<String> stringListArray(){
        StringTokenizer token = new StringTokenizer(this.cleanString());


        while(token.hasMoreElements()){

            wordArray.add(token.nextToken().toLowerCase());
        }

        return wordArray;
    }

    public List<String> getStringListArray(){
     //   stringListArray();
        return stringListArray();
    }

}
