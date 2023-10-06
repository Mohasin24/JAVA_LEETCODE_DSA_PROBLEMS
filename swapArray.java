/* 
 Que :- swap array elements of given index
*/

import java.lang.*;
import java.util.*;

class swapArray 
{
    public static void main(String arg[])
    {
        int arr[] = {11,21,51,101};

        System.out.println(Arrays.toString(arr));

        swapArrayElements(arr, 1, 3);

        System.out.println(Arrays.toString(arr));

    }

    public static void swapArrayElements(int arr[], int in1, int in2)
    {
        int temp = arr[in1];
        arr[in1] = arr[in2];
        arr[in2] = temp;
    }
}
