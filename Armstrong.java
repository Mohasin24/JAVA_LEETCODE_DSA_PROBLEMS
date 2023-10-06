/*
 Que :- Check whether the given number is armstrong or not 
*/

import java.lang.*;
import java.util.*;

class Armstrong
{   
    
    /** 
     * @param n
     * @return int
     */
    public static int numLen(int n)
    {
        int iRet = 0;
        while(n>0)
        {
            iRet++;
            n = n/10;
        }
        return iRet;
    }

    public static void checkArm(int num)
    {
        int length = numLen(num);
        // System.out.println(length);

        int sum = 0, remainder = 0;
        int originalNum = num;

        while(num>0)
        {   
            int mult =1;

            remainder = num%10;
            num = num/10;

            for(int i = 1; i<=length; i++)
            {
                mult = mult*remainder;
            }
        
            sum = sum+mult;
        }
        
        if(originalNum==sum)
        {
            System.out.println(originalNum + " is a armstrong number.");
        }
        else
        {
            System.out.println(originalNum + " is not a armstrong number.");
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int userIn = 0;
        System.out.print("Enter a number :  ");
        userIn = sc.nextInt();

        checkArm(userIn);
    }
}