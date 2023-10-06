<<<<<<< HEAD
<<<<<<< HEAD
/*
Problem Statement :
Given an n x n binary matrix image, flip the image horizontally, then invert it, 
and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].

Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]] 
*/

import java.lang.*;
import java.util.*;;

public class flip_image 
{   
    public static void main(String arg[])
    {
        int image[][] = {{1,1,0},{1,0,1},{0,0,0}};

        int iArr[][] = flipAndInvertImage(image);

        for(int i = 0; i<iArr.length; i++)
        {
            for(int j = 0; j<iArr[i].length; j++)
            {
                System.out.print(iArr[i][j]);
            }
            System.out.println();
        }
        // System.out.println(Arrays.toString(iArr));

    }

    // public static int[][] flipAndInvertImage(int[][] A) {
    //     int C = A[0].length;
    //     for (int[] row: A)
    //         for (int i = 0; i < (C + 1) / 2; ++i) {
    //             int tmp = row[i] ^ 1;
    //             row[i] = row[C - 1 - i] ^ 1;
    //             row[C - 1 - i] = tmp;
    //         }

    //     return A;
    // }
    
    public static int[][] flipAndInvertImage(int[][] image) 
    {   

        for(int i = 0; i<image.length; i++)    
        {  
            for(int j = 0; j<image[i].length/2; j++)
            {
                int temp = image[i][image[i].length - j - 1];
                image[i][image[i].length - j - 1] = image[i][j];
                image[i][j] = temp;
            }

            for(int j = 0; j<image[i].length; j++)
            {   

                if(image[i][j]==1)
                {
                    image[i][j] = 0;
                }
                else if(image[i][j]==0)
                {
                    image[i][j]=1;
                }
            }
        }

        return image;
    }    
}
=======
/*
Problem Statement :
Given an n x n binary matrix image, flip the image horizontally, then invert it, 
and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].

Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]] 
*/

import java.lang.*;
import java.util.*;;

public class flip_image 
{   
    public static void main(String arg[])
    {
        int image[][] = {{1,1,0},{1,0,1},{0,0,0}};

        int iArr[][] = flipAndInvertImage(image);

        System.out.println(Arrays.toString(iArr));

    }
    public static int[][] flipAndInvertImage(int[][] image) 
    {   

        for(int i = 0; i<image.length; i++)    
        {  
            for(int j = 0; j<image[i].length/2; j++)
            {
                int temp = image[i][image[i].length - j - 1];
                image[i][image[i].length - j - 1] = image[i][j];
                image[i][j] = temp;
            }

            for(int j = 0; j<image[i].length; j++)
            {   

                if(image[i][j]==1)
                {
                    image[i][j] = 0;
                }
                else if(image[i][j]==0)
                {
                    image[i][j]=1;
                }
            }
        }

        return image;
    }    
}
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
=======
/*
Problem Statement :
Given an n x n binary matrix image, flip the image horizontally, then invert it, 
and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].

Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]] 
*/

import java.lang.*;
import java.util.*;;

public class flip_image 
{   
    public static void main(String arg[])
    {
        int image[][] = {{1,1,0},{1,0,1},{0,0,0}};

        int iArr[][] = flipAndInvertImage(image);

        System.out.println(Arrays.toString(iArr));

    }
    public static int[][] flipAndInvertImage(int[][] image) 
    {   

        for(int i = 0; i<image.length; i++)    
        {  
            for(int j = 0; j<image[i].length/2; j++)
            {
                int temp = image[i][image[i].length - j - 1];
                image[i][image[i].length - j - 1] = image[i][j];
                image[i][j] = temp;
            }

            for(int j = 0; j<image[i].length; j++)
            {   

                if(image[i][j]==1)
                {
                    image[i][j] = 0;
                }
                else if(image[i][j]==0)
                {
                    image[i][j]=1;
                }
            }
        }

        return image;
    }    
}
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
