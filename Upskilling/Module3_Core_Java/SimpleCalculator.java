/*2. Simple Calculator 
• Objective: Practice arithmetic operations and user input. 
• Task: Develop a calculator that performs addition, subtraction, multiplication, and division. 
• Instructions: 
o Prompt the user to enter two numbers. 
o Ask the user to choose an operation. 
o Display the result of the operation. */

import java.util.Scanner;
public class SimpleCalculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        double num1=sc.nextDouble();
        System.out.println("Enter the 2nd number:");
        double num2=sc.nextDouble();
        System.out.println("Choose the operation you want to perform:");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("The sum of the numbers is:"+(num1+num2));
                break;
            case 2:
                System.out.println("The difference of the numbers is:"+(num1-num2));
                break;
            case 3:
                System.out.println("The product of the numbers is:"+(num1*num2));
                break;
            case 4:
                if(num2!=0)
                {
                    System.out.println("The quotient of the numbers is:"+(num1/num2));
                }
                else
                {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice! Select a valid operation(1-4).");
        }

    }
}

