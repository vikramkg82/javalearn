package NextWordSuggestion;

import java.util.*;

public class PredictNextWord {
    private  Map<String, Map<String, Integer>> wordFrequancymap=new HashMap<>();
    private  String currentWord;
   private int count;
    private WordFrequency map;

    ;

    public PredictNextWord(String currentWord ,int count,String inputString ){
        this.currentWord=currentWord.toLowerCase();
        this.count=count;
        map =new WordFrequency(inputString);

    }



    private List<Map.Entry<String,Integer>> nextWord(){
        this.wordFrequancymap=map.getFrequencyMap();
        if(wordFrequancymap.containsKey(currentWord))
        {
        Map<String,Integer> tempMap = wordFrequancymap.get(currentWord);

        List<Map.Entry<String,Integer>> nextWordList = new ArrayList<>(tempMap.entrySet());
        Comparator<Map.Entry<String,Integer>> sortTheList =  Map.Entry.comparingByValue();
        nextWordList.sort(sortTheList.reversed());

        List<Map.Entry<String,Integer>> nextWordListByCount =new ArrayList<>();

        int numberOfWords = nextWordList.size() < count ? nextWordList.size() : count; // if the count > number of nextWord


        for (int i = 0; i < numberOfWords; i++) {
            nextWordListByCount.add(nextWordList.get(i));
        }
        return nextWordListByCount;
       }
     else
        {
            return null;
        }

    }

    public List<Map.Entry<String,Integer>> getNextWord(){
        return nextWord();
    }
}

