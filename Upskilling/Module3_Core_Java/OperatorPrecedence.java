/*8. Operator Precedence 
• Objective: Explore how Java evaluates expressions. 
• Task: Evaluate and display the result of complex expressions. 
• Instructions: 
o Write expressions combining multiple operators, e.g., int result = 10 + 5 * 2;. 
o Display the result and explain the order of operations.*/

public class OperatorPrecedence
{
    public static void main(String[] args)
    {
        int result1=20+10*2;
        int result2=(20+10)*2;
        int result3=20+10*2-5;
        int result4=20/5+(10+5)*2;
        System.out.println("The result of 20 + 10 * 2 is: "+result1);
        System.out.println("The result of (20 + 10 ) * 2 is: "+result2);
        System.out.println("The result of 20 + 10 * 2 - 5 is: "+result3);
        System.out.println("The result of 20 / 5 + ((10 + 5) * 2) is: "+result4);
        System.out.println("Explanation of operator precedence:");
        System.out.println("In the expression 20 + 10 * 2, multiplication is performed before addition, so it evaluates (10 * 2) first giving 20, and adds the result with 20 giving 20 + 20 = 40.");
        System.out.println("In the expression (20 + 10) * 2, the parentheses have the highest precedence, so it evaluates (20 + 10) first giving 30, and then multiplies the result by 2 giving 30 * 2 = 60.");
        System.out.println("In the expression 20 + 10 * 2 - 5, multiplication is performed first, so it evaluates (10 * 2) giving 20, then addition and subtraction are performed from left to right, so it evaluates 20 + 20 giving 40, and then subtracts 5 giving 40 - 5 = 35.");
        System.out.println("In the expression 20 / 5 + ((10 + 5) * 2), the parentheses are evaluated first, so it evaluates (10 + 5) giving 15, then multiplication is performed giving (15 * 2) = 30, and finally division and addition are performed from left to right, so it evaluates (20 / 5) giving 4, and then adds the result with 30 giving 4 + 30 = 34.");
    }
}