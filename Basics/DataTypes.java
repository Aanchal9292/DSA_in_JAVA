package Basics;

public class DataTypes {
    static void main(){
        // numeric - short,  byte,int,long
        byte num1 = 100;
        long newNum = num1;
        System.out.println(newNum);
        short num2 = 10094;
        System.out.println(num2);
        int num3 = 100000;
        System.out.println(num3);
        long num4 = 100000000;
        System.out.println(num4);

        // floating  point
        float num5 = 3.142436f;
        System.out.println(num5);

        double num6 = 3.14243666777;
        System.out.println(num6);

        // other - char, boolean
        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);
        char firstChar = 'a';  // 97
        System.out.println(firstChar+3);
        System.out.println((char)(firstChar+3));
        // explicit conversion
        long value = 1234567897;
        int value2 = (int)value;
        System.out.println(value2);



    }
}
