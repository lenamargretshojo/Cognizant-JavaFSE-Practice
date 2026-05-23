/*12. Method Overloading 
• Objective: Understand method overloading in Java. 
• Task: Create multiple methods with the same name but different parameters. 
• Instructions: 
o Define methods named add that accept: 
▪ Two integers. 
▪ Two doubles. 
▪ Three integers. 
o Each method should return the sum of its parameters. 
o Call each method and display the results. */

public class MethodOverloading
{
    public static void main(String[] args)
    {
        System.out.println("Sum of 5 and 10 is: " + add(5, 10));
        System.out.println("Sum of 5.5 and 10.5 is: " + add(5.5, 10.5));
        System.out.println("Sum of 5, 10 and 15 is: " + add(5, 10, 15));
    }
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static double add(double a, double b)
    {
        return a+b;
    }
    public static int add(int a, int b, int c)
    {
        return a+b+c;
    }

}