/*********************************************
 * 
 * maggie sanborn
 * 9/7/16
 * chapter 3 notes
 * 
 *********************************************/
 
 import java.util.*;
 import java.text.*;
 
public class practice_prog
{
    /**
     * Constructor for objects of class practice_prog
     */
    
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        
        // PRACTICE PROGRAM 1
        /*
        double dens, mass, vol;
        
        System.out.print("\nMass: ");
        mass = Keyboard.nextInt();
        
        System.out.print("\nVolume: ");
        vol = Keyboard.nextInt();
        
        dens = mass/vol;
        
        if (dens < 1){
            if (dens < 0){
                System.out.print("not possible");
            }else{
                System.out.println("It will float");
            }
        }else{
            System.out.print("It will sink");
        }
        */
        
        /*
        // PRACTICE PROGRAM 2
        int side1, side2, side3;
        
        System.out.print("\nSide 1: ");
        side1 = Keyboard.nextInt();
        
        System.out.print("\nSide 2: ");
        side2 = Keyboard.nextInt();
        
        System.out.print("\nSide 3: ");
        side3 = Keyboard.nextInt();
        
        if(side1 == side2 && side2 == side3 && side3 == side1){
            System.out.println("Equilateral");
        }else if(side1 == side2 || side2 == side3 || side3 == side1){
            System.out.println("Isosceles");
        }else{
            System.out.print("Scalene");
        }
        */
        
        // PRACTICE PROGRAM 3
        
        final double TOLAERANCE = .0001;
        
        double gpa;
        
        System.out.print("\nGrade (f,sp,j,sr): ");
        String grade = Keyboard.nextLine();
        
        if(grade.equals("sr")){
            System.out.print("\nGPA: ");
            gpa = Keyboard.nextDouble();
            if(gpa >= 3.5 && gpa <= 4.0){
                System.out.print("\nyou are eligible for honors");
            }else{
            System.out.print("\nyoure not eligible");
            }
        }else{
            System.out.print("\nyoure not eligible");
        }
        
        /**/
        
        // PRACTICE PROGRAM 4
        int num1, num2, num3;
        
        System.out.print("\nNumber 1: ");
        num1 = Keyboard.nextInt();
        
        System.out.print("\nNumber 2: ");
        num2 = Keyboard.nextInt();
        
        System.out.print("\nNumber 3: ");
        num3 = Keyboard.nextInt();
        
        if(num1 < num2 && num2 < num3){
            System.out.print("\nin order");
        }else if( num3 < num2 && num2 < num1){
            System.out.print("\nin order");
        }else{
            System.out.print("\nnot in order");
        }
        /*
        // PRACTICE PROGRAM 6
        int num1, num2, num3;
        char choice;
        
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
                
                // does <= instead of just < so its more lenient
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
        */
    }
}





































