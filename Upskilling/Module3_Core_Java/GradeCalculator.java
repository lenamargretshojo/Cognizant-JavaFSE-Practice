/*9. Grade Calculator 
• Objective: Use conditional statements to determine grades. 
• Task: Assign grades based on marks entered by the user. 
• Instructions: 
o Prompt the user for marks out of 100. 
o Use if-else statements to assign grades: 
▪ 90-100: A 
▪ 80-89: B 
▪ 70-79: C 
▪ 60-69: D 
▪ Below 60: F 
o Display the assigned grade.*/

import java.util.Scanner;
public class GradeCalculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks out of 100: ");
        double marks=sc.nextDouble();
        if (marks>=90 && marks<=100)
        {
            System.out.println("Your grade is A");
        }
        else if (marks>=80 && marks<90)
        {
            System.out.println("Your grade is B");
        }
        else if (marks>=70 && marks<80)
        {
            System.out.println("Your grade is C");
        }
        else if (marks>=60 && marks<70)
        {
            System.out.println("Your grade is D");
        }
        else if (marks<60)
        {
            System.out.println("Your grade is F");
        }
        else 
        {
            System.out.println("Invalid marks entered! Please enter marks between 0 and 100.");
        }

    }
}