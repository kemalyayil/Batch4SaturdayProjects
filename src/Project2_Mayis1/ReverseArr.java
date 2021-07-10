package Project2_Mayis1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReverseArr {

      /*
        Given a String array (called myArray)
        Reverse the order of the elements of the String array
        Print the reversed array
        NOTE: While printing the array don't use for loop
        Use Arrays.toString(your_array_name);
        Sample:
        Given ["bird", "dog", "cat", "door"] -> prints ["door", "cat", "dog" , "bird"]
        bird dog cat door
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] myArray = myStr.split(" ");

//        Your code starts here,ignore the above codes it is related to test class.
//        Use myArray

        int counter = 0 ;
        String[] reversedArray = new String[myArray.length];
        while (counter<myArray.length){
            reversedArray[counter] = myArray[(myArray.length-1)-counter];
            counter++;
        }

        System.out.println(Arrays.toString(reversedArray));

    }
}// cozum icin 8 mayis mentoring video ya bak
