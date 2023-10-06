/* 
 Que :- Print all three digit armstrong numbers
*/

import java.lang.*;

class threeDigitArmstrong 
{
    public static void displayArm(int num) 
    {
        int sum = 0, remainder = 0;
        int originalNum = num;

        while(num>0)
        {   
            int mult =1;

            remainder = num%10;
            num = num/10;

            for(int i = 1; i<=3; i++)
            {
                mult = mult*remainder;
            }
        
            sum = sum+mult;
        }
        
        if(originalNum==sum)
        {
            System.out.println(sum);
        }      
    }

    public static void main(String arg[]) 
    {   
        for(int i = 100; i<1000; i++)
        {
            displayArm(i);
        }
        
    }
}
