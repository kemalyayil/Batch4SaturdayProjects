package Project2_Mayis1;

public class SumTotal {

    /*
        Create the following 2D String array (you may hardcode for creating it)
        {{"$12", "$22", "5"},{"€9", "€10", "€40", "$1" , "$2"}, {"€12", 6, $4, 1}}

        if the String has $ multiply the value by 3.2
        if the String has € multiply the value by 4.2
        if the element has no $ or € use its own number value
        Print the sum of all values  // (output is to be 441.4)
     */

    public static void main(String[] args) {
        String[][] myArray = {{"$12", "$22", "5"},{"€9", "€10", "€40", "$1" , "$2"}, {"€12", "6", "$4","1"}};
        double sum = 0;
        for(int i=0 ; i< myArray.length; i++){
            for (int j=0 ; j<myArray[i].length; j++){
                if(myArray[i][j].startsWith("$")){
                    myArray[i][j] = myArray[i][j].replaceAll("[^\\d.]", "");
                    double dollar = Double.parseDouble(myArray[i][j]) * (3.2);
                    sum = sum + dollar;
                }
                else if (myArray[i][j].startsWith("€")){
                    myArray[i][j] = myArray[i][j].replaceAll("[^\\d.]", "");
                    double euro = Double.parseDouble(myArray[i][j]) * (4.2);
                    sum = sum + euro;
                }else{
                    double regular = Double.parseDouble(myArray[i][j]);
                    sum = sum + regular;
                }
            }
        }
        System.out.println(sum);

    }
}// cozum icin 8 mayis mentoring video ya bak



