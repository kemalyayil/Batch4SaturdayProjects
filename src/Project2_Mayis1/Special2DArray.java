package Project2_Mayis1;

import java.util.Arrays;
import java.util.Scanner;

public class Special2DArray {

      /*
        Create a 2D int array
        The 2D array has 5 element arrays
        Each element array length is equal its index in the 2D array
        Each element array contains int values of its index number
        Print the 2D array
        So, the output must be: [[], [1], [2, 2], [3, 3, 3], [4, 4, 4, 4]]
        DO NOT HARDCODE! USE LOOPS!
        Note: There is no test case provided for this assignment in the Tests class. You can test it by yourself.
     */

    public static void main(String[] args) {
        int[][] myArray = new int[5][];
        for (int i=0;i<myArray.length;i++){
            myArray[i] = new int[i];
            for(int j = 0; j<i ; j++){
                myArray[i][j]=i;
            }
        }
        System.out.println(Arrays.deepToString(myArray));

    }
}// cozum icin 8 mayis mentoring video ya bak


