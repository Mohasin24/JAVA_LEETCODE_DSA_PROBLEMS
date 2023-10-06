/* 
Given a square matrix of size N x N. The task is to rotate it by 90 degrees in 
anti-clockwise direction without using any extra space. 

Example 1:

Input:
N = 3 
matrix[][] = {{1, 2, 3},
              {4, 5, 6}
              {7, 8, 9}}
Output: 
Rotated Matrix:
3 6 9
2 5 8
1 4 7
*/

import java.lang.*;
import java.util.*;

public class Rotate_by_90_degree 
{
    public static void main(String[] args) 
    {   
        int n = 3;
        int matrix[][] = {{1, 2, 3}, {4, 5, 6},{7, 8, 9}};
        rotateby90(matrix, n);
    }

    public static void rotateby90(int matrix[][], int n) 
    { 
        // code here

        for(int i =0; i<matrix.length; i++)
        {
            int temp = matrix[i][i+1]; // 1 2     5
            matrix[i][i+1] = matrix[i+1][i];  // 2 1   4
            matrix[i+1][i] = temp; // 2
        }
    }
}
