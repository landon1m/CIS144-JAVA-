/*This is not required by all files but is required to impliment a scanner 
and receive input from the user*/
import java.util.Scanner;

public class LinkedClass {
                    //notice the () are empty
    public static void linkedMethod(){

        //This code will impliment a scanner and allow the user to input text
        Scanner input = new Scanner(System.in);

        //Prompt the user for input
        System.out.println("Enter a value: ");

        //Use code similar to this to get a users input
        //This receives an input from the user and stores it as a data type Double
        //in the variable "doubleValue"
        double doubleValue = input.nextDouble();
        //Remember that you can declare other data types such as int or byte
        byte byteValue = 127;
        int intValue = 32;

    };
};
