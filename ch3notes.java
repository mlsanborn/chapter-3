/*********************************************
 * 
 * maggie sanborn
 * 9/1/16
 * chapter 3 notes
 * 
 *********************************************/
 
 import java.util.*;
 import java.text.*;
 import java.io.*; 
 
public class ch3notes
{
    /**
     * Constructor for objects of class ch3notes
     */
    public static void main(String[] args) throws IOException //required for file io!!!
    {
        //
        //Scanner Keyboard = new Scanner(System.in);
        
        int num = 5, num1 = 10;
        
        /*
        System.out.print("Enter a number: ");
        num = Keyboard.nextInt();
        
        System.out.print("Enter a second number: ");
        num1 = Keyboard.nextInt();
        /*
        if(num < num1){
            System.out.println(num + " < " + num1);
            
        
           } //end of if statement
        
        //else{
        //    System.out.println(num + " < " + num1);
        
        /*
        
        double total = .01*1 + .05*2 + .10*3 + .25*4;
        System.out.println(total);
        
        final double TOLERANCE = .0001;
        
        /*
        //if (total == 1.41){
        if (Math.abs(total-1.41)<TOLERANCE){
            System.out.println("Wow it works");
        }else{
            System.out.println("no");
            
            // does NOT work because doubles repeat! even with 0's!!
        }
        */
        /*
        System.out.print("Age: ");
        int age = Keyboard.nextInt();
        
        if (age<8){
            System.out.println("You must use a car seat");
        }else{
            if (age>16){
                System.out.println("You can drive");
            }else if(age>18){
                System.out.println("You are an adult and can vote");
                System.out.println("you can be an adult wow");
            }else if(age>35){
                System.out.println("you can run for president just like kanye west");
            }else{
                System.out.println("nothing really");
            }
        }
        
        /**/
        
        /*
        String word = "apple";
        //String word1 = "cat";
        String word1 = new String("cat");
        /*
        //if ( word.equals(word1) )
        if ( word == word1 ){
            System.out.println(word + "=" + word1);
        }else{
            System.out.println(word1 + "!=" + word);
        } // end of if/else
        /*
        
        System.out.println(word.compareTo(word1));
        
        if ( word.compareTo(word1) < 0){
            System.out.println(word + "<" + word1);
        }else{
            System.out.println(word1 + ">" + word);
        } // end of if/else
        
        /*
        
        //nested ifs
        
        System.out.print("do you have 3 fingers? (y/n) ");
        String fing = Keyboard.nextLine();
        
        if ( fing.equals("y") ){
            System.out.print("is your skin color yellow? ");
            String skin = Keyboard.nextLine();
        
            if ( skin.equals("y") ){
                System.out.println("congrats youre a simpson");
            }else{
                System.out.println("sorry youre not a simpson");
            }
        }else{
            System.out.println("sorry youre not a simpson");
        }
        
        /*
        System.out.println();
        
            boolean a = true, b = false, c = false, d;
            System.out.println(a);
            c = (a = true) || (b = true);
            System.out.println(a + "-" + b + "-" + c);
            
            c = (a = false) || (b = true);
            System.out.println(a + "-" + b + "-" + c);
            
            c = (a = false) && (b = true);
            System.out.println(a + "-" + b + "-" + c);
            
            c = (a = true) && (b = false);
            System.out.println(a + "-" + b + "-" + c);
            
            d =! (a = true) || (b = true) && (c = true);
            System.out.println(a + "-" + b + "-" + c + "-" + d);
            
        /*
        char choice;
        
        System.out.print("What would you like to buy?\n");
        System.out.print("f) fries\n");
        System.out.print("c) cheese\n");
        System.out.print("s) small drink\n");
        
        choice = Keyboard.next().charAt(0);
        
        switch (choice){
            case 'F': //accepts both capital and lowercase
            case 'f':
                System.out.print(".99");
                break; // have tp put in a break, or else it will continue cascading
            case 'C':
            case 'c':
                System.out.print("1.50");
                break;
            case 'S':
            case 's':
                System.out.print(".79");
                break;
            case 65:
                System.out.print("hi");
                break;
            default:
                System.out.print("incorrect data");
            }
        
        /*
        ////////////////////////////////////////////////////////////////////
        /////////////////////////// WHILE LOOPS ////////////////////////////
        ////////////////////////////////////////////////////////////////////
        int test;
        System.out.println("guess my fav number 1-20 (-9999 to exit)");
        
        // #1 - initialize variables
        test = Keyboard.nextInt();
        
        // #2 - test, must be boolean
        while (test != -9999){
            if (test == 11)
                System.out.println("yes");
            else
                System.out.println("guess again");
            //#3 update var
            test = Keyboard.nextInt();
        }
        /**
        
        ///////////////////////////////////////////////////////////////////////
        ///////////////////////////// FOR LOOPS ///////////////////////////////
        ///////////////////////////////////////////////////////////////////////
        
        for (int i = 0, j = 20 ; i < j; i++, j-- ){
            System.out.print("hi" + i + "\t" + j + "\n");
        }
        // i is LOCAL to the for loop !
        //System.out.print("after loop: " + i + "\n");
        /*
        Scanner scanFile = new Scanner(new File ("people.txt"));
        String name, address, phone;
        
        while (scanFile.hasNext()){
            name = scanFile.next();
            address = scanFile.next();
            phone = scanFile.next();
            
            if (phone.substring(0,3).equals("630"))
                System.out.println(name + "\t" + phone.substring(4) );
            else
                System.out.println(name + "\t" + phone);
        }
        /**/
        ///////////////////////////////////////////////////////////////////////
        ////////////////////////////// FILE IO ////////////////////////////////
        ///////////////////////////////////////////////////////////////////////
        //Scanner scanFile = new Scanner
        //(new File ("data\\obamatakebackamerica.txt"));
        
        /*
        String word;
        int countp = 0, county = 0, countn = 0, countwords = 0, countj = 0;
        while (scanFile.hasNext()){
            
            word = scanFile.next();
            
            countwords++;
            
            
            if (word.equalsIgnoreCase("people"))
            countp++;
            if (word.equalsIgnoreCase("wrong") || word.equalsIgnoreCase("wrong."))
            countn++;
            if (word.equalsIgnoreCase("right"))
            county++;
            if (word.equalsIgnoreCase("job") || word.equalsIgnoreCase("jobs"))
            countj++;
        }
            System.out.println("people: " + countp + " wrong: " + countn + " right: " + county + " job: " + countj);
        /**/
        Scanner scanFile = new Scanner(new File ("speaches\\fillmore.txt"));
        
        String word;
        int countwords = 0, len, totallen = 0, avg;
        for (i
        
        while (scanFile.hasNext()){
            word = scanFile.next();
            countwords++;
            
            System.out.println(word);
            
            len = word.length();
            
            totallen += len;
            
            
            
            /*
            if (word.equalsIgnoreCase("people"))
            countp++;
            if (word.equalsIgnoreCase("wrong") || word.equalsIgnoreCase("wrong."))
            countn++;
            if (word.equalsIgnoreCase("right"))
            county++;
            if (word.equalsIgnoreCase("job") || word.equalsIgnoreCase("jobs"))
            countj++;
            /**/
        }
        avg = totallen/countwords;
        //System.out.println("people: " + countp + " wrong: " + countn + " right: " + county + " job: " + countj);
        //System.out.print("total: " + countwords);
        
        /**/
        /**/
        /**/
        /**/
        } //end of main
    } //end of class


































