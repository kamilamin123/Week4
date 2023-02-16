package main.binarySpellCheck;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SpellChecker
   {
      private ArrayList<String> dictionary;

      public SpellChecker() {
        String[] tmp = null;
        try
        {
            tmp = readLines("/Users/kamil.amin/eclipse-workspace/Week4/src/main/binarySpellCheck/dictionary.txt");
        }
        catch(IOException e)
        {
            // Print out the exception that occurred
            System.out.println("Unable to access "+e.getMessage());              
        }
        dictionary = new ArrayList<String>(Arrays.asList(tmp));
      }
  
      /** This uses linear search to find a word 
        * in the dictionary ArrayList and also
        * prints out the number of words checked.
        * If not found, word is misspelled.
      */
      public boolean linearSpellCheck(String word)
      {
          int count = 0;
          for(int i=0; i < dictionary.size(); i++) 
          {
            count++;
            if (word.equals(dictionary.get(i))) {
                System.out.println("Number of words checked: " + count);
                return true;
            }
          }
         System.out.println("Number of words checked: " + count);
         return false;

      }

   /** This uses binary search to find a word 
        * in the dictionary ArrayList.
        * If not found, word is misspelled.
        * ADD IN CODE TO COUNT and PRINT OUT THE NUMBER OF WORDS CHECKED!
      */
  public boolean binarySpellCheck(String word) {
        int left = 0;
        int count = 0;
        int right = dictionary.size() - 1;
        while (left <= right)
        {
           int middle = (left + right) / 2;
           count++;
           if (word.compareTo(dictionary.get(middle)) < 0)
           {
              right = middle - 1;
           }
           else if (word.compareTo(dictionary.get(middle)) > 0)
           {
              left = middle + 1;
           }
           else {
        	  System.out.println("Number of words checked: " + count);
              return true;
           }
         }
        System.out.println("Number of words checked: " + count);
         return false;
     }

    public static String[] readLines(String filename) throws IOException 
    {
        FileReader fileReader = new FileReader(filename);
         
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
         
        while ((line = bufferedReader.readLine()) != null) 
        {
            lines.add(line);
        }
         
        bufferedReader.close();
         
        return lines.toArray(new String[lines.size()]);
    }
      
    
   }