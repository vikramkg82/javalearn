package NextWordSuggestion;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintTheNextWord {
    private List<Map.Entry<String,Integer>> nextWordListByCount =new ArrayList<>();
    public PrintTheNextWord(List<Map.Entry<String,Integer>> nextWordListByCount){
        this.nextWordListByCount = nextWordListByCount;
    }

    public void printNextWord(){

        if(nextWordListByCount == null)
        {
            System.out.println("No Match found");
        }
        else
        {
        for (int i = 0; i < nextWordListByCount.size(); i++) {


            System.out.println(nextWordListByCount.get(i).getKey());
        }
      }
    }
}
