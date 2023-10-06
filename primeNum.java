<<<<<<< HEAD
<<<<<<< HEAD
/*
Que : -Make a function to check if a number is prime or not 
if prime - true
if not a prime - false
*/

import java.lang.*;
import java.util.*;

class primeNum 
{
    public static void checkNum(int n)
    {   
        boolean check = true;
        if(n%2==0)
        {   
            check = false;
        }
        else
        {   
            for(int i = 2; i<=(n/2);i++)  // we have divided number because greater than half of that number cannot completely divide the number.
            {
                if(n%i==0)
                {
                    check = false;
                    break;
                }
            }   
        }

        if(check==true)
        {
            System.out.println(n + " is a prime number.");
        }
        else if(check==false)
        {
            System.out.println(n + " is not a prime number."); 
        }
    }   
    
    public static void main(String arg[])
    {
        int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :-  ");
        num = sc.nextInt();

        checkNum(num);
    }
}
=======
/*
Que : -Make a function to check if a number is prime or not 
*/

import java.lang.*;
import java.util.*;

class primeNum 
{
    public static void checkNum(int n)
    {
        if(n%2==0)
        {
            System.out.println("The numebr " + n + " is a prime number.");
        }
        else
        {
            System.out.println("The numebr " + n + " is not a prime number.");   
        }
    }   
    
    public static void main(String arg[])
    {
        int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :-  ");
        num = sc.nextInt();

        checkNum(num);
    }
}
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
=======
/*
Que : -Make a function to check if a number is prime or not 
*/

import java.lang.*;
import java.util.*;

class primeNum 
{
    public static void checkNum(int n)
    {
        if(n%2==0)
        {
            System.out.println("The numebr " + n + " is a prime number.");
        }
        else
        {
            System.out.println("The numebr " + n + " is not a prime number.");   
        }
    }   
    
    public static void main(String arg[])
    {
        int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :-  ");
        num = sc.nextInt();

        checkNum(num);
    }
}
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
