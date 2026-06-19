package Arrays;

import java.util.Scanner;

public class TwoDArrays {
    static void main() {
        int arr[][] = {{1,2,3},{4,5,7}};
        // finding sum
//        int sum =0;
//        for(int i =0 ; i<arr.length ; i++){
//            for(int j=0 ; j<arr[i].length ; j++){
//                int value = arr[i][j];
//                sum = sum + value;
//            }
//        }
//        System.out.println("Sum : "+ sum);

        // finding product
//        int mul =1;
//        for(int i =0 ; i<arr.length ; i++){
//            for(int j=0 ; j<arr[i].length ; j++){
//                int value = arr[i][j];
//                mul = mul * value;
//            }
//        }
//        System.out.println("Product : "+ mul);

//        // finding max
//        int maxValue = arr[0][0];
//        for(int i =0 ; i<arr.length ; i++){
//            for(int j=0 ; j<arr[i].length ; j++){
//                if(arr[i][j]>maxValue){
//                    maxValue = arr[i][j];
//                }
//            }
//        }
//        System.out.println("Maximum : "+ maxValue);

        // finding minimum

        int minValue = arr[0][0];
        for(int i =0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                if(arr[i][j]<minValue){
                    minValue = arr[i][j];
                }
            }
        }
        System.out.println("Minimum : "+ minValue);

//        // declaration
//        int[][] arr = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//        // input
//        for(int i =0 ; i<arr.length ; i++){
//            for(int j=0 ; j<arr[i].length ; j++){
//                System.out.print("Provide value for row "+i + " = and column = "+j + " : ");
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for(int rowIndex=0 ; rowIndex<arr.length ; rowIndex++) {
//            for (int colIndex = 0; colIndex < arr[rowIndex].length; colIndex++) {
//                System.out.print(arr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }
//        }
        // allocation
//        arr = new int[3][4];
        // init
//        int[][] brr = {{1,2},{2,3},{3,4},{4,5}};
        // jagged array
//        int[][] brr = {{1,2},{2,3,5,7},{3,4,23,56,2,89,56},{4,5,5}};
//        System.out.println(brr[3][0]);
//        int rowLength = brr.length;
//        System.out.println("Row : "+m);
//        int colLength = brr[0].length;
//        System.out.println("Col : " +n);
//        for(int rowIndex =0 ; rowIndex<rowLength ; rowIndex++){
//            // jaise hi m kisi aur row par ayi same point pe maine us row ka length find kiya
//            // current row = brr[rowIndex]  isme kitne columns brr[rowIndex].length
////            int colLength = brr[rowIndex].length;
////            for(int colIndex = 0 ; colIndex< colLength; colIndex++){
////                System.out.print(brr[rowIndex][colIndex] + " ");
////            }
////            System.out.println();
////        }

        // traversal of 2 D array
//        for(int rowIndex=0 ; rowIndex<brr.length ; rowIndex++){
//            for(int colIndex=0 ; colIndex < brr[rowIndex].length ; colIndex++){
//                System.out.print(brr[rowIndex][colIndex] +" ");
//            }
//            System.out.println();
//        }
    }


}
