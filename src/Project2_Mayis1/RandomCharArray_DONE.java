package Project2_Mayis1;

import java.util.Arrays;
import java.util.Random;

public class RandomCharArray_DONE {


      /*
        Create a char array
        The array has a random length between 2 and 22 (inclusive)
        The array should only have random capital letters.
        Print the array.
        Note: There is no test case provided for this assignment in the Tests class. You can test it by yourself.
     */

    public static void main(String[] args) {

        Random rdm = new Random();

        char[] charArray =new char[rdm.nextInt(23-2)+2];

        for (int i=0; i<charArray.length; i++){
            charArray[i] = (char)(rdm.nextInt(91-65)+65); // ASCII TABLE 65-90 +1
        }
        System.out.println(Arrays.toString(charArray));
    }

}// cozum icin 7 mayis mentoring video ya bak
