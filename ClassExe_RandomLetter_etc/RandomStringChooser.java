package ClassExe_RandomLetter_etc;

import java.util.ArrayList;

public class RandomStringChooser {
    private ArrayList <String> wordArray;

    public RandomStringChooser(String[] words) {
        wordArray = new ArrayList<>();
        for (String w: words){
            wordArray.add(w);
        }
    }

    public String getNext(){
        if(wordArray.size() > 0) {
            // get a rabdom number 0 < wordArray size
            int index = (int) (Math.random() * wordArray.size()); //casting
            return wordArray.remove(index);
        }
        return "None";
    }
}


