package Arrays;

import java.util.Scanner;

public class BasicsOfArray {
    static void main() {
//        // declaration
//        int arr[];
//        // allocation
//        arr = new int[5];
//        //init
//        int brr[] = {913,955,32};
//        System.out.println("Value at 0 index : " + brr[0]);
//
//        int n = brr.length;
////        for(int i=0 ; i<=n-1 ;i++){
////            System.out.println(brr[i]);
////        }
//        // for each loop
//        for(int val : brr){
//            System.out.println(val);
//        }
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for(int i=0; i<=n-1 ; i++){
            System.out.print("Provide Input at index "+ i +" : ");
            arr[i] = sc.nextInt();

        }
        // question 1
        // Calculating sum of all elements of an array
//        int sum = 0;
//        System.out.println("Your array contains : ");
//        for(int val : arr){
//            System.out.println(val);
//            sum = sum + val;
//        }
//        System.out.println("Sum : "+sum);
        // question 2
//        int mul = 1;
//        System.out.println("Your array contains : ");
//        for(int val : arr){
//            System.out.println(val);
//            mul = mul * val;
//        }
//        for(int i=0; i<=n-1 ; i++){
//            int value = arr[i];
//            mul = mul * value;
//        }
//        System.out.println("Product : "+mul);
        // question 3
        // finding max value in an array
//        int max = arr[0];
//        for(int i=1; i<=n-1 ; i++){
//
//            if(arr[i]>max){
//                max = arr[i];
//
//            }
//        }
//        System.out.println("Maximum : "+ max);

//
//        }
        // finding minimum
        int minValue = arr[0];
        for(int i=1; i<=n-1 ; i++){

            if(arr[i]<minValue){
                minValue = arr[i];

            }
        }
        System.out.println("Minimum : "+ minValue);

    }
}
