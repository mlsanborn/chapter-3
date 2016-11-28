/*********************************************
 * 
 * maggie sanborn
 * 10/10/16
 * lab 3.6
 * 
 *********************************************/
 
 import java.util.*;
 import java.text.*;
 
public class oddevenzero
{
    /**
     * Constructor for objects of class practice_prog
     */
    
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        
        System.out.print("\nenter a number: ");
        
        String number = Keyboard.nextLine();
        int zcount = 0, ocount = 0, ecount = 0, count = 0;
        
        for(int i=0; i < number.length(); i++){
            char num = number.charAt(i);
            
            switch(num){
                
                case '0':
                zcount += 1;
                break;
                
                case '1':
                ocount += 1;
                break;
                
                case '2':
                ecount += 1;
                break;
                
                case '3':
                ocount += 1;
                break;
                
                case '4':
                ecount += 1;
                break;
                
                case '5':
                ocount += 1;
                break;
                
                case '6':
                ecount += 1;
                break;
                
                case '7':
                ocount += 1;
                break;
                
                case '8':
                ecount += 1;
                break;
                
                case '9':
                ocount += 1;
                break;
                
                default:
                count += 1;
                break;
            }
        }
        
        System.out.print("\nzero: " + zcount + "\nodd: " + ocount + "\neven: " + ecount );
        
    }
}


