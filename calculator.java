/* 
 Que :- Create a basic calculator program in which and keep taking input until user enters q or Q 
*/

import java.lang.*;
import java.text.NumberFormat.Style;
import java.util.*;

class calculator 
{   
    public static Scanner sc = new Scanner(System.in);
    public static void calculate()
    {   
        int ans =0;
        char op;
        
        while(true)
        {
            System.out.println("+");
            System.out.println("-");
            System.out.println("*");
            System.out.println("/");
            System.out.println("%");
            System.out.println("Enter Q to quit");

            System.out.print("\nEnter which operation you want to perform :  ");
            op = sc.next().charAt(0);

            if(op=='Q'||op=='q')
            {   
                break;    
            }
            else if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%')
            {
                int num1 = 0, num2 = 0;
                System.out.print("\nEnter first number :  ");
                num1 = sc.nextInt();
                System.out.print("Enter second number :  ");
                num2 = sc.nextInt();

                if(op=='+')
                {
                    ans = num1+num2;
                }
                else if(op=='-')
                {
                    ans = num1 - num2;
                }
                else if(op=='*')
                {
                    ans = num1 * num2;
                }
                else if(op=='/')
                {
                    ans = num1 / num2;
                }
                else if(op == '%')
                {
                    ans = num1 % num2;
                }

                System.out.println("\nAnswer = "+ ans);  
                System.out.println("\t\t*****\n");      
            }
        }
        
        
    }
    public static void main(String arg[])
    {
        calculate();
    }    
}
