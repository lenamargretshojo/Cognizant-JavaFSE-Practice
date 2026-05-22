/*7. Type Casting Example 
• Objective: Practice type casting between different data types. 
• Task: Convert a double to an int and vice versa. 
• Instructions: 
o Declare a double variable with a decimal value. 
o Cast it to an int and display the result. 
o Declare an int variable and cast it to a double, then display. */
public class TypeCasting
{
    public static void main(String[] args)
    {
        double doublevalue=4.55;
        int intvalue=(int)doublevalue;
        System.out.println("Double value: "+doublevalue);
        System.out.println("Value in integer after casting: "+intvalue);
        int intvalue1=10;
        double doublevalue1=intvalue1;
        System.out.println("Integer value: "+intvalue1);
        System.out.println("Value in double after casting: "+doublevalue1);
    }
}