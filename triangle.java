/*********************************************
 * 
 * maggie sanborn
 * 9/15/16
 * triangle
 * 
 *********************************************/
 
 import java.util.*;
 import java.text.*;
 
public class triangle
{
    /**
     * Constructor for objects of class practice_prog
     */
    
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        
        int side1, side2, side3;
        int ang1, ang2, ang3;
        
        char choice;
        
        System.out.print("\nSides or angles? (s/a): ");
        choice = Keyboard.next().charAt(0);
        
        switch (choice){
            
            case 'S':
            case 's':
                
                System.out.print("\nSide 1: ");
                side1 = Keyboard.nextInt();
                
                System.out.print("\nSide 2: ");
                side2 = Keyboard.nextInt();
                
                System.out.print("\nSide 3: ");
                side3 = Keyboard.nextInt();
                
                if (side1 + side2 >= (side3) && 
                    side2 + side3 >= (side1) &&
                    side1 + side3 >= (side2) &&
                    side1 > 0 &&
                    side2 > 0 &&
                    side3 > 0 ){
                    
                    if (side1 == side2 &&
                        side2 == side3 &&
                        side3 == side1 ){   
                        System.out.print("\nequilateral"); 
                    }else if(side1 == side2 ||
                             side2 == side3 ||
                             side3 == side1 ){
                        System.out.print("\nisosceles");
                    }else if(side1 != side2 &&
                             side2 != side3 &&
                             side3 != side1 ){
                        System.out.print("\nscalene");
                    }
                    
                }else{
                    System.out.print("\nimpossible triangle");
                }
                
                break;
            case 'A':
            case 'a':
                
                System.out.print("\nAngle 1: ");
                ang1 = Keyboard.nextInt();
                
                System.out.print("\nAngle 2: ");
                ang2 = Keyboard.nextInt();
                
                System.out.print("\nAngle 3: ");
                ang3 = Keyboard.nextInt();
                
                if (ang1 + ang2 + ang3 == 180 &&
                    ang1 > 0 &&
                    ang2 > 0 &&
                    ang3 > 0 ){
                    if ( (ang1 < 90) && 
                         (ang2 < 90) && 
                         (ang3 < 90) ){
                        if (ang1 == ang2 &&
                            ang2 == ang3 &&
                            ang3 == ang1 ){
                            System.out.print("\nacute and eqiulateral");
                        }else{
                            System.out.print("\nacute");
                        }
                    }else if ( (ang1 == 90) ||
                         (ang2 == 90) ||
                         (ang3 == 90) ){
                        System.out.print("\nright");
                    }else if ( (ang1 > 90) ||
                         (ang2 > 90) ||
                         (ang3 > 90) ){
                        System.out.print("\nobtuse");
                    }
                }else{
                    System.out.print("\nimpossible triangle");
                }
                
                break;
        }//end of switch
        
    }
}































