/* 
 Que :- Write a program to find maximum value in an array
*/

import java.lang.*;
import java.util.*;

class maximumValueArray 
{   
    public static void Max(int arr[])
    {
        int max = arr[0];

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Max element = "+max);
    }
    public static void main(String[] args) 
    {   
        Scanner sc  = new Scanner(System.in);
        int size = 0;
        System.out.print("Enter size of an array :  ");   
        size = sc.nextInt();

        int arr[] = new int[size];

        for(int i =0; i<size; i++)
        {
            System.out.print((i+1)+" :- ");
            arr[i] = sc.nextInt();
        }

        Max(arr);
    }    
}
