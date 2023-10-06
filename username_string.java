<<<<<<< HEAD
<<<<<<< HEAD
/* 
Que :- Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “helloWorld123@gmail.com”; username = “helloWorld123”
 
*/

import java.lang.*;
import java.util.*;

public class username_string 
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg)
    {
        String Email = "", userName="";
        System.out.print("Enter your email here :-  ");
        Email = sc.next();

        for(int i=0; i<Email.length(); i++)
        {
            if(Email.charAt(i)=='@')
            {
                break;
            }
            userName=userName+Email.charAt(i);
        }

        System.out.print("Your username is :- "+userName);
    }
}
=======
/* 
Que :- Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “helloWorld123@gmail.com”; username = “helloWorld123”
 
*/

import java.lang.*;
import java.util.*;

public class username_string 
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg)
    {
        String Email = "", userName="";
        System.out.print("Enter your email here :-  ");
        Email = sc.next();

        for(int i=0; i<Email.length(); i++)
        {
            if(Email.charAt(i)=='@')
            {
                break;
            }
            userName=userName+Email.charAt(i);
        }

        System.out.print("Your username is :- "+userName);
    }
}
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
=======
/* 
Que :- Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “helloWorld123@gmail.com”; username = “helloWorld123”
 
*/

import java.lang.*;
import java.util.*;

public class username_string 
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg)
    {
        String Email = "", userName="";
        System.out.print("Enter your email here :-  ");
        Email = sc.next();

        for(int i=0; i<Email.length(); i++)
        {
            if(Email.charAt(i)=='@')
            {
                break;
            }
            userName=userName+Email.charAt(i);
        }

        System.out.print("Your username is :- "+userName);
    }
}
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
