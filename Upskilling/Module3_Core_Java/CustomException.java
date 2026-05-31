/*21. Custom Exception 
• Objective: Create and use custom exceptions. 
• Task: Define a custom exception InvalidAgeException. 
• Instructions: 
o Throw InvalidAgeException if the user's age is less than 18. 
o Catch the exception and display a message.*/

import java.util.Scanner;
class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message)
    {
        super(message);
    }
}
public class CustomException
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        try
        {
            if (age<0 || age>170)
            {
                throw new InvalidAgeException("Please enter a valid age. Age must be between 0 and 170.");
            }
            else if(age<18)
            {
                throw new InvalidAgeException("Age must be 18 or more to proceed.");

            }
            else
            {
                System.out.println("You are eligible to proceed.");
            }
        }
        catch (InvalidAgeException e)
        {
            System.out.println("Error: " +e.getMessage());
        }
        sc.close();
    }
}