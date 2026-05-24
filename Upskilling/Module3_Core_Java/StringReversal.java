/*15. String Reversal 
• Objective: Manipulate strings. 
• Task: Reverse a string entered by the user. 
• Instructions: 
o Prompt the user for a string. 
o Use a loop or StringBuilder to reverse the string. 
o Display the reversed string.*/

import java.util.Scanner;
public class StringReversal
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String str=sc.nextLine();
        StringBuilder reversed=new StringBuilder(str);
        System.out.println("The reversed string is: " +reversed.reverse());
    }
}