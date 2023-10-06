/* 
 Que :- Display how many times a number occured
*/

import java.lang.*;
import java.util.*;

class counting {
    public static int numCount(long num, int check) {
        int occ = 0;
        long remainder = 0;

        while (num != 0) {
            remainder = num % 10;
            if (check == remainder) {
                occ++;
            }
            num = num / 10;
        }
        return occ;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        long num = 0, iRet = 0;
        int count = 0;

        System.out.print("Enter a number :  ");
        num = sc.nextLong();
        System.out.print("Enter a number to check occurance :  ");
        count = sc.nextInt();

        iRet = numCount(num, count);
        System.out.println("Number of occurance of " + count + " is " + iRet + " times");
    }
}
