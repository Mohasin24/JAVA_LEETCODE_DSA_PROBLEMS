/* 
 Que :- Write a program to reverse an array
*/

import java.lang.*;
import java.util.*;

class reverseArray 
{   
    public static void reverse(int a[])
    {   
        int start = 0;
        int end  = (a.length-1); // array index
        int temp = 0;

        // while(start<end)
        // {
        //     temp = arr[start];
        //     arr[start]=arr[end];
        //     arr[end]=temp;
        //     start++;
        //     end--;
        // }

        int cnt = a.length-1;
        for(int i = 0; i<(a.length/2); i++)
        {   
            temp = a[cnt];
            a[cnt] = a[i];
            a[i] = temp;
            cnt--;
        }

        System.out.println("After reversing the array.");
        for(int i = 0; i<a.length;i++)
        {
            System.out.print(a[i]+", ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size :  ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i =0; i<size; i++)
        {
            System.out.print((i+1)+" :- ");
            arr[i] = sc.nextInt();
        }

        reverse(arr);  
    }
}
