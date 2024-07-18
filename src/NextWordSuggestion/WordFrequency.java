package NextWordSuggestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency {
   private  List<String> wordArray = new ArrayList<>();
    private Map<String, Map<String,Integer>> wordfrequamcymap = new HashMap<>();
    private TextProcessing textProcessing  ;

   public WordFrequency(String inputString){
       textProcessing = new TextProcessing(inputString);
   }



    private Map<String,Map <String,Integer>> frequencyMap(){
        this.wordArray = textProcessing.getStringListArray();

        for (int i = 0; i < wordArray.size()-1; i++) {

            String currentWord = wordArray.get(i);
            String nextWord =wordArray.get(i+1);

            wordfrequamcymap.putIfAbsent(currentWord,new HashMap<>());
            if(wordfrequamcymap.get(currentWord).containsKey(nextWord)){
                wordfrequamcymap.get(currentWord).put(nextWord,wordfrequamcymap.get(currentWord).get(nextWord)+1);
            }
            else{
                wordfrequamcymap.get(currentWord).put(nextWord,1);
            }

        }

        return wordfrequamcymap;

    }

    public Map<String,Map<String,Integer>> getFrequencyMap(){

        return frequencyMap();
    }

}
