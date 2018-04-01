import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by huzaifa.aejaz on 3/25/18.
 */
public class DesignStructure {
    HashMap<Integer,HashMap<Character, ArrayList<String>>> sizeMap;
    /** Initialize your data structure here. */
    public DesignStructure() {
       sizeMap = new HashMap<>();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        //to add a word, we first check its size
        int wordLen = word.length();
        if(sizeMap.size()==0){//if size map is empty
            HashMap<Character, ArrayList<String>> wordMap = new HashMap<>();
            ArrayList<String> list = new ArrayList<>();
            list.add(word);
            wordMap.put(word.charAt(0),list);
            sizeMap.put(wordLen,wordMap);
        }
        else{
            if(sizeMap.get(wordLen)!=null){
                HashMap<Character, ArrayList<String>> tempHold = sizeMap.get(wordLen);
                if(tempHold.get(word.charAt(0))!= null){
                    ArrayList<String> temper = tempHold.get(word.charAt(0));
                    temper.add(word);
                    tempHold.put(word.charAt(0),temper);
                    sizeMap.put(wordLen,tempHold);
                }
                else{
                    ArrayList<String> temper = new ArrayList<>();
                    temper.add(word);
                    tempHold.put(word.charAt(0),temper);
                    sizeMap.put(wordLen,tempHold);
                }
                //now inside this get the list, if it is null then add otherwise just remove and add..thats complex right there
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(word);
                HashMap<Character, ArrayList<String>> adder = new HashMap<>();
                adder.put(word.charAt(0),list);
                sizeMap.put(wordLen,adder);
            }
        }
    }
    public boolean search(String word) {
        boolean found = false;
    int wordLen = word.length();
        if(sizeMap.get(wordLen)!=null){
            HashMap<Character,ArrayList<String>> hash = sizeMap.get(wordLen);
            if(word.charAt(0)!='.'){
                ArrayList<String> suspects = hash.get(word.charAt(0));
                for(String str : suspects){
                 if(comparer(str,word)) found = true;
                }
            }else{
                ArrayList<String> longList = new ArrayList<>();
                for(Character ch: hash.keySet()){
                    ArrayList<String> eachList = hash.get(ch);
                    if(!found){
                        for(String str : eachList){
                            if(comparer(str,word)) found = true;
                        }
                    }

                }
            }
        }
       return found;

    }
    private boolean comparer(String word, String RegWord){
        boolean match =true;
        if(word.length()==RegWord.length()){

            int pointer = 0;
            while(pointer < word.length() && match){
                if(RegWord.charAt(pointer)=='.'|| word.charAt(pointer)==RegWord.charAt(pointer)){
                    pointer++;
                }
                else{
                  match= false;
                }
            }

        }
        else{
            match= false;
        }
       return match;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */

}
