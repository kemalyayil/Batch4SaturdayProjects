package Project2_Mayis1;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeArray {

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
           if (fruitArray[i].equals("Orange")){   // burada ignorcase kullanmistik. yukarda oyle demedigi icin
                fruitArray[i] = "Apple"; // kullanmayin dedi hoca
            }

        }
        System.out.println(Arrays.toString(fruitArray));
    }
}// cozum icin 7 mayis mentoring video ya bak
