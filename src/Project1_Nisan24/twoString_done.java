package Project1_Nisan24;

import java.util.Scanner;

public class twoString_done {

    public static void main(String[] args) {

        /*
            Given two string by using scanner class and add each other
            add the second string after the first one
            If the first word ends with the same letter as the second word starts with, then remove it.

            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */

        Scanner dp = new Scanner(System.in);
        String  allElements = dp.nextLine();
        String[] elements = allElements.split(" ");
        String s1 = elements[0];
        String s2 = elements[1];

        // code start here use s1 and s2 as words
        char lastIndexS1 = s1.charAt(s1.length()-1);
        char firstIndexS2 = s2.charAt(0);

        if (lastIndexS1 == firstIndexS2) {
            String s3 = s1.replace("s1.charAt(s1.length()-1)", "");
            System.out.println(s3.concat(s2));
        } else {
            System.out.println(s1.concat(s2));
        }

        System.out.println("printing");

//        char lastIndexS1 = s1.charAt(s1.length() - 1);
//        char firstIndexS2 = s2.charAt(0);
//
//        if (lastIndexS1 == firstIndexS2) {
//
//            String news2 = s2.replace(s2.charAt(0), ' ');
//            String lastNews2 = news2.trim();
//            System.out.println(s1.concat(lastNews2));
//
//        } else {
//            System.out.println(s1.concat(s2));
//
//        }
    }
}
