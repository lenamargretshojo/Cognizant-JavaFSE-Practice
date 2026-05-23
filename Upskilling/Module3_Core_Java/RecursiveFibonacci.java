/*13. Recursive Fibonacci 
• Objective: Implement recursion. 
• Task: Calculate the nth Fibonacci number using recursion. 
• Instructions: 
o Prompt the user for a positive integer n. 
o Define a recursive method fibonacci(int n) that returns the nth Fibonacci number. 
o Display the result. */

import java.util.Scanner;
public class RecursiveFibonacci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a positive integer:");
        int num=sc.nextInt();
        if (num<=0)
        {
            System.out.println("Please enter a positive integer greater than 0.");
        }
        else
        {
            int result=fibonacci(num);
            System.out.println("The " + num + "th Fibonacci number is: " + result);
        }
    }
    public static int fibonacci(int n)
    {
        if (n==1)
        {
            return 0;
        
        }
        else if (n==2)   
        {
            return 1;
        }
        else
        {
            return fibonacci(n-1)+fibonacci(n-2);
        }     
    }
}