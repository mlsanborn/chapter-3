/*********************************************
 * 
 * maggie sanborn
 * 9/28/16
 * intro loop programs
 * 
 *********************************************/
 
 import java.util.*;
 import java.text.*;
 
public class intro_loops
{
    /**
     * Constructor for objects of class intro_loops
     */
    
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        
        
        ///////////////////////////
        //////// PROGRAM 1 ////////
        ///////////////////////////
        /*
        int enter = 0, sum = 0, count = 0, avg;
        
        while (enter != -9999){
            System.out.print("\nenter an integer (-9999 to stop entering numbers): ");
            enter = Keyboard.nextInt();
            
            if ( enter != -9999){
                sum += enter;
                count += 1;
            }
        }
        avg = sum / count;
        System.out.print("\naverage: " + avg);
        
        /*
        ///////////////////////////
        //////// PROGRAM 2 ////////
        ///////////////////////////
        
        int num = 0, high = -9999, low = 9999, enter, count = 0, range;
        while (num < 10){
            
            System.out.print("\nenter a number: ");
            enter = Keyboard.nextInt();
           
            if (enter > high){
                high = new Integer(enter);
            }
            if (enter < low){
                low = new Integer(enter);
            }
            System.out.print("\n" + enter + high + low);
            count += 1;
        }
        range = high - low;
        System.out.print("\nHigh : " + high + " Low: " + low + " Range: " + range);
        /*
        
        ///////////////////////////
        //////// PROGRAM 3 ////////
        ///////////////////////////
        
        String quote = "The true sign of intelligence is not knowledge but imagination.\n" + 
                "- Albert Einstein";
        char find;
        int num;
        
        System.out.println(quote);
        
        System.out.print("\n enter a char to find in quote: ");
        find = Keyboard.next().charAt(0);
        
        int count = 0;
        for (int len = quote.length(); len > 0; len-- ){
            if (quote.charAt(len-1) == find)
                count += 1;
        }
        
        System.out.print("the letter " + find + " is found " + count + " times");
        
        /**/
        ///////////////////////////
        //////// PROGRAM 4 ////////
        ///////////////////////////
        
        System.out.print("\nenter a sentence: ");
        String sent = Keyboard.nextLine();
        
        int count = 0;
        for (int len = sent.length(); len > 0; len-- ){
            System.out.print(sent.charAt(len-1));
            count += 1;
        }
        System.out.print("\n");
        for (int len = sent.length(), i = 0; i<len; i++){
            char let = sent.charAt(i);
            if (let >= 65 && let <= 90)
                System.out.print(let);
        }
        System.out.print("\n");
        int num = 0;
        for (int len = sent.length(), i = 0; i<len; i++){
            char let = sent.charAt(i);
            switch(let){
                case 'A':
                case 'a':
                    System.out.print("_");
                    num += 1;
                    break;
                case 'E':
                case 'e':
                    System.out.print("_");
                    num += 1;
                    break;
                case 'I':
                case 'i':
                    System.out.print("_");
                    num += 1;
                    break;
                case 'O':
                case 'o':
                    System.out.print("_");
                    num += 1;
                    break;
                case 'U':
                case 'u':
                    System.out.print("_");
                    num += 1;
                    break;
                default:
                    System.out.print(let);
            }
        }
        System.out.print("\nnumber of vowels: " + num);
        /**/
        /**/
        /**/
    }
}

























