/* 
 Que :- Reverse a number
*/
import java.lang.*;
import java.util.*;

class reverseNum 
{
    public static long numReverse(long num)
    {
        long remainder = 0, reverse = 0;

        while(num!=0)
        {
            remainder = num%10;
            reverse = (reverse*10) + remainder;
            num = num/10;
        }

        return reverse;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        long num = 0;
        long iRet = 0;
        
        System.out.print("Enter a number :  ");
        num = sc.nextLong();

        iRet = numReverse(num);

        System.out.println("Reverse of "+num+" is "+iRet);
    }
}
