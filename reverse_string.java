<<<<<<< HEAD
<<<<<<< HEAD
/* 
Que :- Reverse a String (using StringBuilder class) 
*/

import java.lang.*;
import java.util.*;

public class reverse_string 
{   
    // manipulating same string
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb.length());

        for(int i = sb.length()-1; i>=0; i--)
        {  
            sb.append(sb.charAt(i));
            sb.delete(i, i+1);
        }
        System.out.println(sb.length());
        System.out.println(sb);

        Solution sl = new Solution();

        System.out.println(sl.reveString("Hello Mohasin Patel"));

        System.out.println(sl.reveString_new("Hello Mohasin Patel"));

        String str = "mk";

        // Converts this string to a new character array.
        char c[] = str.toCharArray();
        System.out.println(Arrays.toString(c));
        
        
    
    }     
}

class Solution
{
    public String reveString(String str)
    {   
        int n = str.length();
        // char [] arr = new char[n];
        
        // for(int i = 0; i<n; i++)
        // {
        //     arr[i] = str.charAt(i);
        // }

        char[] arr = str.toCharArray();
        
        for(int i = 0; i<n/2; i++)
        {
            char temp = arr[n-1-i];
            arr[n-1-i]=arr[i];
            arr[i] = temp;
        }

        return new String(arr);
    }
    public String reveString_new(String str)
    {   
        StringBuilder sb = new StringBuilder("Hello");
        
        StringBuilder a = new StringBuilder("");

        for (int i = sb.length() - 1; i >= 0; i--) {
            a.append(sb.charAt(i));
        }
        
        return sb.toString();
    }



}
=======
/* 
Que :- Reverse a String (using StringBuilder class) 
*/

import java.lang.*;
import java.util.*;

public class reverse_string 
{   
    // manipulating same string
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb.length());

        for(int i = sb.length()-1; i>=0; i--)
        {  
            sb.append(sb.charAt(i));
            sb.delete(i, i+1);
        }
        System.out.println(sb.length());
        System.out.println(sb);

        Solution sl = new Solution();

        System.out.println(sl.reveString("Hello Mohasin Patel"));

        System.out.println(sl.reveString_new("Hello Mohasin Patel"));
    }     
}

class Solution
{
    public String reveString(String str)
    {   
        int n = str.length();
        char [] arr = new char[n];
        
        for(int i = 0; i<n; i++)
        {
            arr[i] = str.charAt(i);
        }
        
        for(int i = 0; i<n/2; i++)
        {
            char temp = arr[n-1-i];
            arr[n-1-i]=arr[i];
            arr[i] = temp;
        }

        return new String(arr);
    }
    public String reveString_new(String str)
    {   
        StringBuilder sb = new StringBuilder("Hello");
        
        StringBuilder a = new StringBuilder("");

        for (int i = sb.length() - 1; i >= 0; i--) {
            a.append(sb.charAt(i));
        }
        
        return sb.toString();
    }



}
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
=======
/* 
Que :- Reverse a String (using StringBuilder class) 
*/

import java.lang.*;
import java.util.*;

public class reverse_string 
{   
    // manipulating same string
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb.length());

        for(int i = sb.length()-1; i>=0; i--)
        {  
            sb.append(sb.charAt(i));
            sb.delete(i, i+1);
        }
        System.out.println(sb.length());
        System.out.println(sb);

        Solution sl = new Solution();

        System.out.println(sl.reveString("Hello Mohasin Patel"));

        System.out.println(sl.reveString_new("Hello Mohasin Patel"));
    }     
}

class Solution
{
    public String reveString(String str)
    {   
        int n = str.length();
        char [] arr = new char[n];
        
        for(int i = 0; i<n; i++)
        {
            arr[i] = str.charAt(i);
        }
        
        for(int i = 0; i<n/2; i++)
        {
            char temp = arr[n-1-i];
            arr[n-1-i]=arr[i];
            arr[i] = temp;
        }

        return new String(arr);
    }
    public String reveString_new(String str)
    {   
        StringBuilder sb = new StringBuilder("Hello");
        
        StringBuilder a = new StringBuilder("");

        for (int i = sb.length() - 1; i >= 0; i--) {
            a.append(sb.charAt(i));
        }
        
        return sb.toString();
    }



}
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
