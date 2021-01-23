package pl.edu.agh.hangman;

import java.io.*; 
import java.util.*;
import java.util.Random;

public class Word{

  private static ArrayList<String> words;

  public static void constructor(String filename) throws IOException{

  ArrayList words = new ArrayList();
  BufferedReader read = new BufferedReader(new FileReader("slowa"));
  String line = read.readLine();


    while (line != null){
      words.add(line);
      //line = reader.readline();
    }
  }

  public static void getRandomWord(){
Random rand = new Random();
String randomWord = words.get(rand.nextInt(words.size()));
}
}