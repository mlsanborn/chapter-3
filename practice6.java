/*********************************************
 * 
 * maggie sanborn
 * 9/13/16
 * practice program 6
 * 
 *********************************************/
 
 import java.util.*;
 import java.text.*;
 
public class practice6
{
    /**
     * Constructor for objects of class practice_prog
     */
    
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        
        int num1, num2, num3;
        char choice;
        
        //asks user whether or not if it should be strict or lenient
        System.out.print("\nStrict or lenient? (s/l): ");
        choice = Keyboard.next().charAt(0); 
        
        switch (choice){
            case 'S':
            case 's':
                // asks user specific numbers
                System.out.print("\nNumber 1: ");
                num1 = Keyboard.nextInt();
        
                System.out.print("\nNumber 2: ");
                num2 = Keyboard.nextInt();
        
                System.out.print("\nNumber 3: ");
                num3 = Keyboard.nextInt();
                
                if(num1 < num2 && num2 < num3){
                    System.out.print("increasing");
                }else if( num3 < num2 && num2 < num1){
                    System.out.print("decreasing");
                }else{
                    System.out.print("\nneither increasing or decreasing");
                }
                break; //breaks code
                
            case 'L':
            case 'l':
                System.out.print("\nNumber 1: ");
                num1 = Keyboard.nextInt();
        
                System.out.print("\nNumber 2: ");
                num2 = Keyboard.nextInt();
        
                System.out.print("\nNumber 3: ");
                num3 = Keyboard.nextInt();
                
                // does <= instead of just <, so that it is more lenient
                // also makes sure that the last number is greater/less than the first number so it doesnt
                // just count the same 3 numbers as increasing/decreasing
                if ( (num1 <= num2 && num2 <= num3) && num3 > num1 ){
                    System.out.print("\nincreasing");
                }else if( (num1 >= num2 && num2 >= num3) && num3 < num1 ){
                    System.out.print("\ndecreasing");
                }else if( num1 == num2 && num2 == num3){
                    System.out.print("\nboth increasing and decreasing");
                }else{
                    System.out.print("\nneither increasing or decreasing");
                }
                break; //breaks code
        }//end of switch
    }
}
