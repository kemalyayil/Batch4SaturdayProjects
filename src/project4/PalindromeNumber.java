package project4;

    /*
       Create a method whose name is returnNum
       It takes an int as parameter
       It returns an int

       The method reverses the parameter int (that is, it re-forms an int by reversing the order of its digits)
       It returns the reversed int

       Example:
       The parameter int  = 1234
       The method returns 4321
    */

/*
Create another method whose name is palindromeNum
It takes an int as parameter
It returns an int

Palindrome means a word or number reads the same backward as forward like "mom" , "refer" , "131" , "1221"

Find the sum of parameter int and its reverse.
Check if the sum is a palindrome number or not.
If the sum is not a palindrome number, find the reverse of the sum.
And add the sum and the reverse of the sum to find the new total.
Check if the new total is a palindrome or not.
Repeat the same steps until you reach a palindrome number in your result.
After you reached the palindrome number, find the number of repeats(loops) in order to hit a palindrome number.
The method returns the number of loops

 Example:
     int parameter = 349  -->
      349  + 943 = 1292    Note : since 1292 is not palindrome do the same step for this  // first loop
      1292 + 2921 = 4213   Note : 4213 is not palindrome do the same step for this // second loop
      4213 + 3124 = 7337   Note : 7337 is a palindrome number  // third loop
 The method returns 3
 */

public class PalindromeNumber {
    public static int reverse(int a ){
        String x= String.valueOf(a);
        String rvrs="";
        for (int i = x.length()-1;i>=0; i--) {
            rvrs+=x.charAt(i);
        }
        int integer= Integer.parseInt(rvrs);
        return integer;
    }

    public static int palindromeNum(int a){

        int sum=a;
        int b= reverse(sum);
        int count= 0;
        while(sum!=b){
            sum=sum+b;
            b=reverse(sum);
            count++;
        }
       return  count;
    }

//    public static void main(String[] args) {
//        int x = 349;
//        solution(x);
    }
