import java.lang.*;
import java.util.*;

public class peak_element 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,13,2,25};    
        int iRet = peakElement(arr, arr.length);

        System.out.println(iRet);
    }

    public static int peakElement(int[] arr,int n)
    {
       //add code here.
       
        Arrays.sort(arr);
        
        int maxElemenPos = n - 1;    
        
        System.out.println(Arrays.toString(arr));

        return maxElemenPos;
    }

}
