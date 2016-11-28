/*********************************************
 * 
 * maggie sanborn
 * 10/4/16
 * lab 3.12
 *     *    
 *    *** 
 *   ***** 
 *  ******* 
 * *********
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 *********************************************/
 

public class tri_d
{
    /**
     * Constructor for objects of class practice_prog
     */
    
    public static void main(String[] args)
    {
        for (int i=0; i<=5; i++ ){
            
            for (int st = i; st<=5;st++){
                System.out.print(" ");
            }
            for (int sp = i; sp>=0;sp--){
                System.out.print("*");
            }
            for (int sp = i-1; sp>=0;sp--){
                System.out.print("*");
            }
            
            System.out.print("\n");
        }
        
        
        for (int i=5; i>=0; i-- ){
            
            for (int st = i; st<=5;st++){
                System.out.print(" ");
            }
            for (int sp = i; sp>=0;sp--){
                System.out.print("*");
            }
            for (int sp = i-1; sp>=0;sp--){
                System.out.print("*");
            }
            
            System.out.print("\n");
        }
    }
}







