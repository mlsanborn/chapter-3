/*********************************************
 * 
 * maggie sanborn
 * 10/11/16
 * lab 3.6
 * 
 *********************************************/
 
 import java.util.*;
 import java.text.*;
 
public class palindrome
{
    /**
     * Constructor for objects of class practice_prog
     */
    
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        
        System.out.print("\nenter a word: ");
        String w = Keyboard.nextLine();
        boolean cont = true;
        
        //doesnt check the spaces
        String word = w.replace(" ", "");
        
        
        for (int i = 0, j = word.length(); i < j; i++, j--){
            //tests to see if it can still test for a palindrome
            
            if (cont == true){
                //if letter in the beginning is not equal to letter towards the end
                if ( word.charAt(i) != word.charAt(j-1) ){
                    cont = false;
                }else{
                    cont = true;
                }
            }
        }
        
        //if cont is true, then the word is a palindrome
        if (cont == true){
            System.out.print("\n" + w + " is a palindrome");
        }else{
            System.out.print("\n" + w + " is not a palindrome");
        }
        
    }
}
