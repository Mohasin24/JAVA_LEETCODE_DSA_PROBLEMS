<<<<<<< HEAD
<<<<<<< HEAD
/* 
Problem Statement :
You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.

 

Example 1:

Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)
Example 2:

Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
Example 3:

Input: people = [3,5,3,4], limit = 5
Output: 4
Explanation: 4 boats (3), (3), (4), (5)
 

Constraints:

1 <= people.length <= 5 * 104
1 <= people[i] <= limit <= 3 * 104
*/
import java.util.Arrays;

public class Boats_to_Save_People_881 
{
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.numRescueBoats(new int[] {3,5,3,4}, 5));
    }    
}

class Solution {
    public int numRescueBoats(int[] people, int limit) 
    {
        int boats = 0;
        int n = people.length;
        int i = 0; 
        int j = n-1;

        Arrays.sort(people);

        while(i<=j)
        {
           if(people[i]+people[j]<=limit)
           {
               boats++;
               i++;
               j--;
           }
           else
           {
               boats++;
               j--;
           }
        }

        return boats;
    }
}
=======
/* 
Problem Statement :
You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.

 

Example 1:

Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)
Example 2:

Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
Example 3:

Input: people = [3,5,3,4], limit = 5
Output: 4
Explanation: 4 boats (3), (3), (4), (5)
 

Constraints:

1 <= people.length <= 5 * 104
1 <= people[i] <= limit <= 3 * 104
*/
import java.util.Arrays;

public class Boats_to_Save_People_881 
{
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.numRescueBoats(new int[] {3,5,3,4}, 5));
    }    
}

class Solution {
    public int numRescueBoats(int[] people, int limit) 
    {
        int boats = 0;
        int n = people.length;
        int i = 0; 
        int j = n-1;

        Arrays.sort(people);

        while(i<=j)
        {
           if(people[i]+people[j]<=limit)
           {
               boats++;
               i++;
               j--;
           }
           else
           {
               boats++;
               j--;
           }
        }

        return boats;
    }
}
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
=======
/* 
Problem Statement :
You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.

 

Example 1:

Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)
Example 2:

Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
Example 3:

Input: people = [3,5,3,4], limit = 5
Output: 4
Explanation: 4 boats (3), (3), (4), (5)
 

Constraints:

1 <= people.length <= 5 * 104
1 <= people[i] <= limit <= 3 * 104
*/
import java.util.Arrays;

public class Boats_to_Save_People_881 
{
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.numRescueBoats(new int[] {3,5,3,4}, 5));
    }    
}

class Solution {
    public int numRescueBoats(int[] people, int limit) 
    {
        int boats = 0;
        int n = people.length;
        int i = 0; 
        int j = n-1;

        Arrays.sort(people);

        while(i<=j)
        {
           if(people[i]+people[j]<=limit)
           {
               boats++;
               i++;
               j--;
           }
           else
           {
               boats++;
               j--;
           }
        }

        return boats;
    }
}
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
