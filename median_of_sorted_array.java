import java.util.Arrays;

public class median_of_sorted_array 
{
    public static void main(String[] args) 
    {
        int nums1[] = {1,3};
        int nums2[] = {2};

        double dResult = findMedianSortedArrays(nums1, nums2);

    }   
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double iRet = (double)(nums1.length+nums2.length)/2;

        int newArr[] = new int[(nums1.length+nums2.length)];
        for(int i =0; i<newArr.length; i++)
        {
            if(i<nums1.length)
            {
                newArr[i] = nums1[i];
            }
            else 
            {   
                int Cnt = 0;
                newArr[i] = nums2[Cnt];
                Cnt++;
            }

        }
        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));
        return iRet;
    } 
}
