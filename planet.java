/*********************************************
 * 
 * maggie sanborn
 * 9/21/16
 * planetary weight
 * 
 *********************************************/
 
 import java.util.*;
 import java.text.*;
 
public class planet
{
    /**
     * Constructor for objects of class planet
     */
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.00");
        
        char choice;
        double weight, planweight, pw;
        
        System.out.print("\n\nWeight: ");
        weight = Keyboard.nextDouble();
        
        System.out.print("\nEarth: a \nMercury: b \nVenus: c \nMars: d \nJupiter: e \nSaturn: f \nUranus: g");
        System.out.print("\nNeptune: h \nPluto: i \nMoon: j");
        
        System.out.print("\n\nPlanet: ");
        choice = Keyboard.next().charAt(0);
        
        System.out.print("\n\n");
        
        switch (choice){
            
            case 'A':
            case 'a':
                pw = 1.0;
                System.out.print("\nYour weight on Earth is the same! You weigh " + weight);
                break;
            
            case 'B':
            case 'b':
                pw = .38;
                planweight = weight * pw;
                System.out.print("Your weight on Mercury is " + fmt.format(planweight));
                break;
            
            case 'C':
            case 'c':
                pw = .91;
                planweight = weight * pw;
                System.out.print("Your weight on Venus is " + fmt.format(planweight));
                break;
                
            case 'D':    
            case 'd':
                pw = .38;
                planweight = weight * pw;
                System.out.print("Your weight on Mars is " + fmt.format(planweight));
                break;
                
            case 'E':    
            case 'e':
                pw = 2.36;
                planweight = weight * pw;
                System.out.print("Your weight on Jupiter is " + fmt.format(planweight));
                break;
                
            case 'F':    
            case 'f':
                pw = .91;
                planweight = weight * pw;
                System.out.print("Your weight on Saturn is " + fmt.format(planweight));
                break;
                
            case 'G':    
            case 'g':
                pw = .89;
                planweight = weight * pw;
                System.out.print("Your weight on Uranus is " + fmt.format(planweight));
                break;
                
            case 'H':    
            case 'h':
                pw = 1.12;
                planweight = weight * pw;
                System.out.print("Your weight on Neptune is " + fmt.format(planweight));
                break;
                
            case 'I':    
            case 'i':
                pw = .06;
                planweight = weight * pw;
                System.out.print("Your weight on Pluto is " + fmt.format(planweight));
                break;
                
            case 'J':    
            case 'j':
                pw = .16;
                planweight = weight * pw;
                System.out.print("Your weight on the moon is " + fmt.format(planweight));
                break;
                
            default:
                System.out.print("Not a valid choice!");
        }//end of switch
        
    }
}
