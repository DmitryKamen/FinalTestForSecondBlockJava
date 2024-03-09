package FinalTestForSecondBlockJava;

import java.util.HashMap;

import FinalTestForSecondBlockJava.Intermethod.FrequencyCounter;
import FinalTestForSecondBlockJava.Intermethod.LongestWordFinder;
import FinalTestForSecondBlockJava.Intermethod.Reader;
import FinalTestForSecondBlockJava.Intermethod.WordsCounter;

public class Model implements Reader, WordsCounter, LongestWordFinder, FrequencyCounter {
    String[] words;

    public Model(String file) {
        this.words = readingData(file);
    }

    @Override
    public Integer CounterWords() {
        return words.length;
    }

    @Override
    public String findLongestWord() {
        Integer max = 0;
        String maxWord = "";
        for (String string : words)
            if (string.length() >= max) {
                max = string.length();
                maxWord = string;
            }

        return maxWord;
    }

    @Override
    public HashMap<String, Integer> getFrequencyWords() {
        HashMap<String, Integer> freq = new HashMap<>();

        for (String string : words)
            if (freq.containsKey(string)) 
                freq.put(string, freq.get(string) + 1);
            else
                freq.put(string, 1);

        return freq;
    }
}
