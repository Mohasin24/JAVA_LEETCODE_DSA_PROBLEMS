package unsolved;
import java.lang.*;
import java.util.*;

public class valid_parenthesis
{
    public static void main(String[] args) 
    {
        String s = "()[]}{";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) 
    {   
        boolean check = false;
        for(int i = 1; i<s.length(); i++)
        {   
            
            // int n = s.charAt(i-1);
            // System.out.println(n);
            System.out.println(s.charAt(i-1));
            // System.out.println(s.charAt(i));
            if(s.charAt(i-1)==40 && s.charAt(i)==41)
            {   
                // ascii value for '()'
                check=true;
            }
            else if(s.charAt(i-1)==91 && s.charAt(i)==93)
            {   
                // ascii value for '[]'
                check=true;
            }
            else if(s.charAt(i-1)==123 && s.charAt(i)==125)
            {   
                // ascii value for '{}'
                check=true;
            }
        }

        return check;
    }
}