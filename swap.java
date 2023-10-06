/* 
 Que :- Write a program to swap two numbers
*/

import java.lang.*;
import java.util.*;

class swap 
{
    public static Scanner sc = new Scanner(System.in);

    public static void swap(int n1, int n2)
    {
        int temp = n1;
        n1  = n2;
        n2 = temp;
        System.out.println("Numbers after swap");
        System.out.println("Num1 = "+n1+"\nNum2 = "+n2);
        // This will only valid in this function scope only it will not gone change the original values
    }
    public static void main(String arg[])
    {
        int num1 = 0, num2 = 0;
        System.out.print("Enter first number :  ");
        num1 = sc.nextInt();
        System.out.print("Enter second number :  ");
        num2 = sc.nextInt();
        // swap(num1,num2);

        int temp = num1;
        num1  = num2;
        num2 = temp;
        System.out.println("Numbers after swap");
        System.out.println("Num1 = "+num1+"\nNum2 = "+num2);
        
    }
}
