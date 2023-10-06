import java.util.Arrays;
import java.util.HashMap;

class try1
{
    public static void main(String[] args) 
    {
       Solution sl = new Solution();
       System.out.println(sl.maxDistance(new int[]{4,4,4,11,4,4,11,4,4,4,4,4}));
    }

}

class Solution {
    public int maxDistance(int[] colors) 
    {
        int maxDist1 = 0; 
        int i = 0; 
        int j = colors.length-1;

        while(i<=j)    
        {
            int diff = j-i;
            if(colors[i]!=colors[j] && maxDist1<diff)
            {
                maxDist1 = diff;
                break;
            }
            else
            {
                j--;
            }
        }

        i = 0; 
        j = colors.length-1;

        while(i<=j)    
        {
            int diff = j-i;
            if(colors[i]!=colors[j] && maxDist1<diff)
            {
                maxDist1 = diff;
                break;
            }
            else
            {
                i++;
            }
        }

        return maxDist1;
    }
}