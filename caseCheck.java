/* 
 Que :- Check whether the user entered character is lower case or upper case 
*/

import java.lang.*;
import java.util.*;

class caseCheck 
{
    public static void case_check(char c)
    {
        if(c>64&&c<91)
        {
            System.out.println("Upper case character.");
        }
        else if(c>96&&c<122)
        {
            System.out.println("Lower case character.");
        }
        else
        {
            System.out.println("Invalid character input.");
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character :  ");
        char cWord = sc.next().charAt(0);
        case_check(cWord);
    }
}
