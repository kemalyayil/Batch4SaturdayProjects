package Project2_Mayis1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChangeArray_DONE {

      /*
        Given one array of Strings
        If this string array contains "Orange" change all "Orange" to "Apple"
        Print the Array

        Sample:
        Given [Peach, Berry, Orange, WaterMelon, Orange] -> prints [Peach, Berry, Apple, WaterMelon, Apple]
        Peach Berry Orange WaterMelon Orange
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] fruitArray = myStr.split(" ");

//        Code starts here
//        You should use fruitArray (given above)


        for (int i = 0; i < fruitArray.length; i++) {
           if (fruitArray[i].equalsIgnoreCase("Orange")){
                fruitArray[i] = "Apple";
            }

        }
        System.out.println(Arrays.toString(fruitArray));
    }
}// cozum icin 7 mayis mentoring video ya bak
