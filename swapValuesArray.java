/* 
 Que :- Swap values in array 
*/

import java.lang.*;

class swapValuesArray 
{   
    public static void swap(int arr[], int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return;
    }
    public static void main(String arg[])
    {
        int arr[] = {11,21,51,101};

        System.out.println("Before swapping the values.");

        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }

        swap(arr,0,3);

        System.out.println("\nAfter swapping index 0 and 3");
        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
    }
}
