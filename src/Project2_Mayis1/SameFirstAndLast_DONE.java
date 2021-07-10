package Project2_Mayis1;

import java.util.Arrays;
import java.util.Scanner;

public class SameFirstAndLast_DONE {
   /*

    Given an array of ints whose length is 1 or more,
    Print true if the first element and the last element are equal.
    Print false otherwise

    [1, 2, 3] → false
    [1, 2, 3, 1] → true
    [1, 2, 1] → true
    [1] → true
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] array = myStr.split(" ");
        int[] myArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            myArray[i] = Integer.parseInt(array[i]);
        }


//      Your code starts here, ignore the above codes it is related to test class.
//      Use myArray
        char a = 8594;

        if (myArray[0] == myArray[myArray.length-1]){
            System.out.println(Arrays.toString(myArray) + " " + a + " true");
        }
        else{
            System.out.println(Arrays.toString(myArray)+ " " + a + " false");
        }

//        boolean isSame = false;               // daha kisa cozum
//
//        if (myArray[0] == myArray[myArray.length-1]) {
//            isSame = true;
//        }
//        System.out.println(isSame);

    }
// cozum icin 8 mayis mentoring video ya bak
}