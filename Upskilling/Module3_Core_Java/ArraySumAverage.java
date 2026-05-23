/*14. Array Sum and Average 
• Objective: Work with arrays and perform calculations. 
• Task: Calculate the sum and average of elements in an array. 
• Instructions: 
o Prompt the user to enter the number of elements. 
o Read the elements into an array. 
o Calculate and display the sum and average.*/

import java.util.Scanner;
public class ArraySumAverage
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int num=sc.nextInt();
        if (num<=0)
        {
            System.out.println("Please enter a positive integer for number of elements.");
        }
        else
        {
            double[] arr=new double[num];
            System.out.println("Enter the array elements to perform sum and average: ");
            for (int i=0;i<num;i++)
            {
                arr[i]=sc.nextDouble();
            }
            double sum=0;
            for (int i=0;i<num;i++)
            {
                sum+=arr[i];
            }
            double avg=sum/num;
            System.out.println("The sum of the array elements is: " + sum);
            System.out.println("The average of the array elements is: " + avg);
        }
    }
}