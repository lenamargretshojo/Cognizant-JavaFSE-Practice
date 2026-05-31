/*20. Try-Catch Example 
• Objective: Handle exceptions gracefully. 
• Task: Handle division by zero using try-catch. 
• Instructions: 
o Prompt the user for two integers. 
o Attempt to divide the first by the second. 
o Catch any ArithmeticException and display an appropriate message. */

import java.util.Scanner;
public class TryCatchExample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int numerator=sc.nextInt();
        System.out.println("Enter the denominator:");
        int denominator=sc.nextInt();
        try
        {
            int result=numerator/denominator;
            System.out.println("The result of " +numerator+ " when divided by " +denominator+ " is: " +result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: Division by zero is not allowed. Please provide a non-zero denominator.");

        }
    }
}

