/*********************************************
 * 
 * maggie sanborn
 * 9/23/16
 * license
 * 
 *********************************************/
 
 import java.util.*;
 import java.text.*;
 
public class license
{
    /**
     * Constructor for objects of class practice_prog
     */
    
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.00");
        
        double val, basecharge = 200.0, hold;
        
        
        
        System.out.print("\nvalue of car: ");
        val = Keyboard.nextDouble();
        /**/
        
        
        if (val >= 10000 && val < 20000){
            hold = val - 10000;
            basecharge += hold * .02;
        }else if (val >= 20000 && val < 40000){
            hold = val - 20000;
            basecharge += hold * .04 + (10000 *.02);
        }else if (val >= 40000){
            hold = val - 40000;
            basecharge += hold * .06 + (10000 *.02) + (20000 * .04);
        }
        
        System.out.print("Total sticker cost: $" + fmt.format(basecharge) );
        
        /**/
        
       
    }
}






















