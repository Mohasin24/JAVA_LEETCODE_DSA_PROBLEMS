/* 
Problem Statement :
Given a matrix of size n x n such that it has only one 0, Find the positive number 
(greater than zero) to be placed in place of the 0 such that sum of the numbers in 
every row, column and two diagonals become equal. If no such number exists, return -1.

Note: Diagonals should be only of the form matrix[i][i] and matrix[i][n-i-1]. 
n is always greater than 1.
 

Example 1:

Input: matrix = {{5, 5}, {5, 0}}
Output: 5
Explanation: The matrix is
5 5
5 0
Therefore If we place 5 instead of 0, all
the element of matrix will become 5. 
Therefore row 5+5=10, column 5+5=10 and 
diagonal 5+5=10, all are equal.
*/

import java.lang.*;
import java.util.*;

public class missing_number_in_matrix {
    public static void main(String[] args) 
    {
        int matrix[][] = { {5, 5}, {5, 0}};

        long iRet = missingNo(matrix);

        System.out.println(iRet);

    }

    public static long missingNo(int matrix[][]) 
    {
        long num = 0;
        long rowSum = 0;

        int zeroRow = 0, zeroCol = 0;
        long leftDiaSum = 0;
        long rightDiaSum = 0;
        long zeroRowSum = 0;
        boolean check = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                if (matrix[i][j] == 0) {
                    zeroRow = i;
                    zeroCol = j;
                    check = true;
                }
            }

            if(check==true)
            {
                break;
            }
        }

        if (check == true) 
        {   
            // sum of row
            if (zeroRow == (matrix.length - 1)) {
                rowSum = 0;

                int row = zeroRow - 1;
            
                for (int i = 0; i < matrix[row].length; i++) {
                    rowSum += matrix[row][i];
                }
            } else if (zeroRow >= 0) {
                rowSum = 0;
                int row = zeroRow + 1;
     
                for (int i = 0; i < matrix[row].length; i++) {
                    rowSum += matrix[row][i];
                }
            }

            // sum of diagonals 
            for (int i = 0; i < matrix.length; i++) {
                leftDiaSum += matrix[i][i];
                rightDiaSum += matrix[i][matrix.length - i - 1];
            }

            // sum of zero row
            for(int i = 0; i<matrix[zeroRow].length; i++)
            {
                zeroRowSum+=matrix[zeroRow][i];
            }

            num = rowSum-zeroRowSum;

            zeroRowSum = zeroRowSum + num;

            if(leftDiaSum<rightDiaSum)
            {
                leftDiaSum+=num;
            }
            else if(rightDiaSum<leftDiaSum)
            {
                rightDiaSum+=num;
            }

            if(rowSum==leftDiaSum && leftDiaSum==rightDiaSum && rightDiaSum==zeroRowSum)
            {
                return num;
            }
            else
            {
                return -1;
            }
        }
        else
        {
            return -1;
        }
    }
}
