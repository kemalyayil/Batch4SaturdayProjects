package Project1_Nisan24;

import java.util.Scanner;

public class RandomNum_done {


    /*
    Given a positive integer number whose is name is max ,

    create a random number between 0 to max

    output should be int

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();

        //  code Start here don't change before this line

        System.out.println((int)((Math.random() * max)));


    }
}