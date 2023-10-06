/* 
 Que :- find nth fibonacci number
*/

import java.lang.*;
import java.util.*;

class fibonacci 
{
    public static int findFib(int n)
    {   
        int iRet = 0;
        for(int i = 2; i<=n; i++)
        {
            iRet = iRet + i;
        }

        return iRet;
    }
    public static void main(String arg[])    
    {
        Scanner sc  = new Scanner(System.in);

        int num = 0, fib = 0;
        System.out.println("Enter number to find the fibonacci term :  ");
        num = sc.nextInt();

        fib = findFib(num);
        System.out.println(fib);
        
    }
}
