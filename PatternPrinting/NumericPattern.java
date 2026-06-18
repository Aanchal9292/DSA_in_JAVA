package PatternPrinting;

import java.util.Scanner;
public class NumericPattern {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        // simple
//        for(int  i=1 ; i<=n ; i++){
//            for(int j=1 ; j<=i ; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        // non repeated numbers
//        int count=1;
//        for(int  i=1 ; i<=n ; i++){
//            for(int j=1 ; j<=i ; j++){
//                System.out.print(count+" ");
//                count++;
//            }
//            System.out.println();
//        }
//        for(int row=1 ; row<=n ;row++){
//            for(int col=1 ; col<=n-row ; col++){
//                System.out.print("  ");
//            }
//            for(int col=1 ; col<=row ; col++){
//                System.out.print(col+" ");
//            }
//            if(n==1){
//                System.out.print("  ");
//            }
//            else{
//                int rowValue = row;
//                int decRowValue = row-1;
//                for(int col=1 ; col<=row-1; col++){
//
//                    System.out.print(decRowValue+" ");
//                    decRowValue--;
//                }
//            }
//            System.out.println();
//        }

        for(int row=1; row<=n ; row++){
            for(int  col=1 ; col<=n-row ; col++){
                System.out.print("  ");
            }
            for(int  col=1 ; col<=row*2-1 ; col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }


    }
}
