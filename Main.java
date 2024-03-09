package FinalTestForSecondBlockJava;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        Model m = new Model("FinalTestForSecondBlockJava\\input.txt");

        System.out.println("\nКолличество слов: " + m.CounterWords());

        System.out.println("\nСамое длинное слово: " + m.findLongestWord());

        System.out.println("\nЧастота слов: ");
        for (Map.Entry<String, Integer> entry : m.getFrequencyWords().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }    
}
