/*********************************************
 * 
 * maggie sanborn
 * 10/11/16
 * lab 3.6
 * 
 *********************************************/
 
 import java.util.*;
 import java.text.*;
 
public class seedtri
{
    /**
     * Constructor for objects of class practice_prog
     */
    
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        
        int size, seed, hold;
        
        System.out.print("\nenter size: ");
        size = Keyboard.nextInt();
        
        System.out.print("\nenter seed: ");
        seed = Keyboard.nextInt();
        /**/
        for (int i=5; i>=0; i-- ){
            
            for (int st = i; st<=5;st++){
                System.out.print(" ");
            }
            for (int sp = i; sp>=0;sp--){
                System.out.print("*");
            }
            
            System.out.print("\n");
        }
            /**/
        int j = seed, count=0;
        for (int i=size; i>0; i--){
            
            //hold = seed + count;
            
            for (int st = i; st<size;st++){
                System.out.print(" ");
            }
            
            j = seed + count;
            for (int sp = i, k = count; sp>0;sp--, k++){
                j += k;
                while (j>9){
                    j-=9;
                }
                System.out.print(j);
            }
            System.out.print("\n");
            count++;
        }
            
        }
        /**/
    }













