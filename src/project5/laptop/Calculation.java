package project5.laptop;

import java.util.ArrayList;

public class Calculation {

     /*
        Create method whose name is getRam

        Parameter is ArrayList<String>
        return type is int

        if ram is 32 gb add 300 to price
        if ram is 16 gb add 200 to price
        if ram is 8 gb add 100 to price
        if ram is 4 gb add 50 to price

        return the price.
     */
     public static int getRam(ArrayList<String> strArr) {

         int price = 0;

         for (int i = 0; i < strArr.size(); i++) {

             if (strArr.get(i).contains("32")) {
                 price += 300;
             }
             if (strArr.get(i).contains("16")) {
                 price += 200;
             }
             if (strArr.get(i).contains("8")) {
                 price += 100;
             }
             if (strArr.get(i).contains("4")) {
                 price += 50;
             }
         }
         return price;


    /*
       Create method name is getCPU

        return type is int
        Parameter is ArrayList<String>

        if CPU is i3 add 200 to price
        if CPU is i5 add 300 to price
        if CPU is i7 add 500 to price

        return the price.
     */
     }
         public static int getCPU(ArrayList<String> strArr){

             int price= 0;
             for (int i = 0; i < strArr.size(); i++) {
                 if (strArr.get(i).contains("i3")) {
                     price += 200;
                 }
                 if (strArr.get(i).contains("i5")) {
                     price += 300;
                 }
                 if (strArr.get(i).contains("i7")) {
                     price += 500;
                 }
             }
             return price;
         }

    /*
      Create method name is getColor

      Parameter is ArrayList<String>

      return type is int

      if Color is Red add 400 to price
      if Color is Orange add 300 to price
      if Color is Silver add 200 to price
      if Color is Black add 150 to price

      return the price.
   */
    public static int getColor(ArrayList<String> strArr){

        int price = 0;
        for (int i = 0; i < strArr.size(); i++) {
            if (strArr.get(i).contains("Red")) {
                price += 400;
            }
            if (strArr.get(i).contains("Orange")) {
                price += 300;
            }
            if (strArr.get(i).contains("Silver")) {
                price += 200;
            }
            if (strArr.get(i).contains("Black")) {
                price += 150;
            }
        }
        return price;
    }
    /*
      Create method name is getSize

      return type is int

      Parameter is ArrayList<String>

      if Size contains "Mini" add 100 to price
      if Size contains "Middle" add 200 to price
      if Size contains "Max" add 300 to price

      return the price.
   */

    public static int getSize(ArrayList<String> strArr){

        int price = 0;

        for (int i = 0; i < strArr.size(); i++) {
            if (strArr.get(i).contains("Mini")) {
                price += 100;
            }
            if (strArr.get(i).contains("Middle")) {
                price += 200;
            }
            if (strArr.get(i).contains("Max")) {
                price += 300;
            }
        }
        return price;

    }
    }
