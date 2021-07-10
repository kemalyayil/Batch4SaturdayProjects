import java.util.Scanner;

public class twoString {

    public static void main(String[] args) {

        /*
            Given two string by using scanner class and add each other
            if first word last letter is same with second word first letter then remove one of them.

            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */

        Scanner dp = new Scanner(System.in);
        String  allElements = dp.nextLine();
        String[] elements = allElements.split(" ");
        String s1 = elements[0];
        String s2 = elements[1];

        // code start here use s1 and s2 as words

        char lastIndexS1 = s1.charAt(s1.length() - 1);
        char firstIndexS2 = s2.charAt(0);

        if (lastIndexS1 == firstIndexS2) {

            String news2 = s2.replace(s2.charAt(0), ' ');
            String lastNews2 = news2.trim();
            System.out.println(s1.concat(lastNews2));

        } else {
            System.out.println(s1.concat(s2));

        }
        }


    }

