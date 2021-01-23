package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Words{
public String readFile() {
    
    int totalLines = 0;    
    File file = new File("slowa.txt");
    
    BufferedReader br = null;
    try {
        br = new BufferedReader(new FileReader(file));
        while ((br.readLine()) != null) {
            totalLines++;
        }
        br.close();
        br = new BufferedReader(new FileReader(file));
        Random random = new Random();
        int randomInt = random.nextInt(totalLines);
        int count=0;
        String icaocode;
        while ( (icaocode = br.readLine()) != null) {               
            if (count == randomInt) {
                br.close();
                return icaocode;
            }
            count++;
        }
         br.close();
    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + file.toString());
    } catch (IOException e) {
        System.out.println("Unable to read file: " + file.toString());
    }    
    return "word";
    
    }
	
}