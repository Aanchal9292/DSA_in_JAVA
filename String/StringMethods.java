package String;
import java.util.Scanner;
public class StringMethods {
//    static void printString(String str){
//        int n = str.length();
//        for(int i =0 ; i<n ; i++){
//            System.out.println(str.charAt(i));
//        }
//    }
//    static int getLength(String str){
//        char[] arr = str.toCharArray();
//        int len = arr.length;
//        return len;
////        for(char ele : str){
////            count++;
////        }     // this is not applicable
//
//    }
//    static int getVowelCount(String str){
//        int count =0;
////        System.out.println("Found at index : ");
//        for(int i=0 ; i<str.length() ; i++ ){
//            char ch = str.charAt(i);
//
//            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U'){
////                System.out.print( i +" , ");
//                count++;
//
//            }
//        }
//        return count;
//    }

    // reverse a string
    static String reverseString(String str){
        String reverse = "";
        int n = str.length();
        for(int i=n-1 ;i>=0 ; i-- ){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

// check string is palindrome
    static boolean isPalindrome(String str){
        String original = str;
        String reverse = reverseString(original);
        // compare
        for(int i=0 ; i<original.length() ; i++){
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);

                if (ch1 != ch2) {
                    return false;
                }


        }
        return true;
    }

    static void main() {
//        printString("love");
        String str = "racecar";
//        System.out.println(reverseString(str));
        System.out.println(isPalindrome(str));
//        System.out.println(getLength(str));
//        System.out.println(getVowelCount(str));
     // split ->  output -> String array
//        String input = "My,name,is,Love";
//        String[] words = input.split(",");
//        for(String str : words){
//            System.out.println(str);
//        }

//        String name ="Babbar";
//        name = name.replace('b','l');
//        System.out.println(name);


//        String name = "Babbar";
//        char[] crr = name.toCharArray();
//        // print the char array
//        for(char ch: crr){
//            System.out.println("Value of char : "+ ch);
//        }

//        String name = "I am a girl";
//        System.out.println(name.startsWith("I"));
//        System.out.println(name.endsWith("a girl"));


        // empty -> length=0
        // blank -> empty or sirf spaces h string
//        String str = "   ";
//        System.out.println(str.length());
//        System.out.println(str.isEmpty());
//        System.out.println(str.isBlank());
//        String name = "  Love  ";
//        System.out.println(name.length());
//        name = name.trim();
//        System.out.println(name.length());

//        String name = "My name is Love";
        // 0->M , 1->Y
        // beginIndex->3  (inclusive)
        // endIndex->6 (exclusive)
//        System.out.println(name.substring(3,6));
//        System.out.println(name.contains("Love"));  // case sensitive
//        System.out.println(name.toUpperCase());
//        String name1 = "BABBAR";
//        System.out.println(name1.toLowerCase());

//        int num = 5123;
//        String str = String.valueOf(num);
//        System.out.println(num+1);
//        System.out.println(str + 1);   // concatenation

//        String str = "Babbar";
//        System.out.println(str.length());
//        System.out.println(str.charAt(2));
//        String name = "BABBAR";
//        System.out.println(str.equals(name));
//        System.out.println(str.equalsIgnoreCase(name));



    }
}
