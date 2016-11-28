/*********************************************
 * 
 * maggie sanborn
 * 10/14/16
 * file io
 * 
 *********************************************/
 
 import java.util.*;
 import java.text.*;
 import java.io.*;
 
public class file_io
{
    /**
     * Constructor for objects of class practice_prog
     */
    
    public static void main(String[] args) throws IOException
    {
        String word;
        int countwords = 0, len, totallen = 0, avg;
        int cp = 0, cn = 0, cy = 0;
        
        Scanner scanFile = new Scanner(new File ("speaches\\fillmore.txt"));
        for(int i=0; i<3; i++){
            String ln = scanFile.nextLine();
            System.out.println(ln);
        }
        
        while (scanFile.hasNext()){
            word = scanFile.next();
            countwords++;
            
            //System.out.println(word);
            
            len = word.length();
            
            totallen += len;
            
            /**/
            
            if (word.equalsIgnoreCase("people"))
            cp++;
            if (word.equalsIgnoreCase("no"))
            cn++;
            if (word.equalsIgnoreCase("yes"))
            cy++;
            /**/
        }
        avg = totallen/countwords;
        System.out.print("\ntotal: " + countwords);
        System.out.print("\navg length of words: " + avg);
        System.out.print("\npeople: " + cp + "\nno: " + cn + "\nyes: " + cy);
        //System.out.print("total: " + countwords);
        
        /**/
        /**/
        /**/
        /**/
    }
}













