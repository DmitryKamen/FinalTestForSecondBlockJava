package FinalTestForSecondBlockJava.Intermethod;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public interface Reader {
   default String[] readingData(String file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file));) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            return sb.toString().replaceAll("\\s+", " ").split(" ");
        }
        catch(IOException e) {
            System.out.println("Файл не найден");
            return null;
        }
    } 
}