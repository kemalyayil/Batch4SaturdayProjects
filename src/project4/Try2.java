package project4;

public class Try2 {
    public static void main(String[] args) {
        String str = "a5ab555bb.. cc  5cc55";
        System.out.println(charCount(str));

    }
    public static Integer charCount (String text){

        int count = 0;

        for(int i=0; i < text.length(); i++)
        {    if(text.charAt(i) == count)
            count++;
        }

        return count;
    }
    }

