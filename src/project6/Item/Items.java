package project6.Item;

public class Items {

    /*
   Create the Instance variables
     private double price
     private static double allUserPrice


       Create a method name is ItemName
       Return type is void
       Parameter is String(myItem)

       NOTE : USE SWITCH STATEMENT

       if myItem = Rose teddy bear
           add 30 to price variable

       if myItem = Iphone max
           add 850.23 to price variable

        if mmyItem = laptop mouse
           add 23.50 to price variable

        if myItem = Monitor
           add 90.23 to price variable

         if myItem = charger
           add 43.20 to price variable

        if myItem = hdmi cable
           add 5.90 to price variable

        if myItem = mug
           add 15.79 to price variable

    */
    private double price;
    private static double allUserPrice;

    public void ItemName(String myItem) {

        switch (myItem) {
            case "Rose teddy bear":
                this.price += 30;
                break;
            case "Iphone max":
                this.price += 850.23;
                break;
            case "laptop mouse":
                this.price += 23.50;
                break;
            case "Monitor":
                this.price += 90.23;
                break;
            case "charger":
                this.price += 43.20;
                break;
            case "hdmi cable":
                this.price += 5.90;
                break;
            case "mug":
                this.price += 15.79;
        }
    }

    /*
        Create a method name is colorPrice
        Return type is void
        Parameter is String(color)

        NOTE : USE SWITCH STATEMENT

           if color = Red
            add 10 to price variable

           if color = Blue
            add 6 to price variable

           if color = Black
            add 4 to price variable

           if color = White
            add 2 to price variable
     */
    public void colorPrice(String color) {

        switch (color) {
            case "Red":
                this.price += 10;
                break;
            case "Blue":
                this.price += 6;
                break;
            case "Black":
                this.price += 4;
                break;
            case "White":
                this.price += 2;
        }
    }

    /*
    Create a method name is customText
    return type is double
    first parameter is boolean and second parameter is String

    if boolean true and String length is more than 10
        add 5 to price variable

    if boolean true and String length is less than and equal to 10
        add 3 to price variable

     */
    public double customText(boolean bl, String str) {

        if (bl && str.length() > 10) {
            this.price += 5;
        } else if (bl) {
            this.price += 3;
        }
        return this.price;
    }

    /*

        Create a method name is AddtoAllUserPrice
        return type is void
        no parameter

        add price to allUserPrice

     */
    public void AddtoAllUserPrice() {

        allUserPrice += this.price;
    }

    /*
        Create a static method name is getAllUserPrice
        return type is double
        no parameter

        return the allUserPrice
     */
    public static double getAllUserPrice() {

        return allUserPrice;
    }
}
