/*********************************************
 * 
 * maggie sanborn
 * 9/15/16
 * lab 3.2
 * 
 *********************************************/
 
 import java.util.*;
 import java.text.*;
 
public class leapyear
{
    /**
     * Constructor for objects of class practice_prog
     */
    
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        
        int yr;
        
        System.out.print("\nInput year: ");
        yr = Keyboard.nextInt();
        
        if (yr > 1582){
            if ( (yr%4) == 0 ){
                if ( (yr%400) == 0){
                    System.out.println(yr + " is a leap year");
                }else if ( (yr%100) != 0 ){
                    System.out.println(yr + " is a leap year");
                }else{
                System.out.println(yr + " is not a leap year");
                }
            }else{
                System.out.println(yr + " is not a leap year");
            }
        }else{
            System.out.println("time traveler??");
        }
        
    }
}































