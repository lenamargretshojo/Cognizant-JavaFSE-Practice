/*11. Factorial Calculator 
• Objective: Use loops to perform repetitive calculations. 
• Task: Calculate the factorial of a number entered by the user. 
• Instructions: 
o Prompt the user for a non-negative integer. 
o Use a for loop to calculate the factorial. 
o Display the result.*/

import java.util.Scanner;
public class FactorialCalculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Factorial Calculator!");
        System.out.println("Please enter a non-negative integer:");
        int num=sc.nextInt();
        if (num<0)
        {
            System.out.println("Factorial is undefined for negative numbers. Please enter a non-negative integer.");
        }
        else
        {
            long fact=1;
            for (int i=1; i<=num; i++)
            {
                fact*=i;
            }
            System.out.println("The factorial of " + num + " is: " + fact);
        }
    }
}