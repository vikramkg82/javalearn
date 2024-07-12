package Map;
import java.util.*;

public class SortedHasMap {
     HashMap<String,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        String string = "Apart from counting words and characters, our online editor can help you to improve word choice and writing style, and, optionally, help you to detect grammar mistakes and plagiarism. To check word count, simply place your cursor into the text box above and start typing. You'll see the number of characters and words increase or decrease as you type, delete, and edit them. You can also copy and paste text from another program over into the online editor above. The Auto-Save feature will make sure you won't lose any changes while editing, even if you leave the site and come back later. ";
        HashMap<String,Integer> map = new HashMap<>();
        String[] array = string.split(" ");
         for (int i = 0; i < array.length; i++)
         {
              if(map.containsKey(array[i])){
                  map.put(array[i],map.get(array[i])+1);
              }
              else
              {
                  map.put(array[i],1);
              }
        }
        SortedHasMap instance = new SortedHasMap();
        instance.ConvertHashMaptoList(map);
    }


    public void ConvertHashMaptoList(Map<String,Integer> unsortedmap)
    {
        List<Map.Entry<String,Integer>> list = new ArrayList<>(unsortedmap.entrySet()); //convert map to list of map
        list.sort(Map.Entry.comparingByValue()); // sort the list of map ;tried reversed() got error --need  Millan  magic here
        for (Map.Entry<String,Integer> entry : list) {

            System.out.println(entry.getKey() + "---->" + entry.getValue());


    }


    }

}
